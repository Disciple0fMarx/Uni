library ieee;
use ieee.std_logic_1164.all;


entity testbench is
end testbench;


architecture bench of testbench is
    component half_adder is
        port(
            A, B: in std_logic;
            S, Cout: out std_logic
        );
    end component;

    -- Inputs
    signal A: std_logic := '0';
    signal B: std_logic := '0';

    -- Outputs
    signal S: std_logic;
    signal Cout: std_logic;
begin
    UUT: half_adder port map(
        A => A,
        B => B,
        S => S,
        Cout => Cout
    );
    test: process
    begin
        A <= '0', '1' after 40 ns;
        B <= '0', '1' after 20 ns, '0' after 40 ns, '1' after 60 ns;
    end process;
end bench;
