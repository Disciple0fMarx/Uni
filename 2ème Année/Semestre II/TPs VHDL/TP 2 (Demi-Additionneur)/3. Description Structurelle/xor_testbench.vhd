library ieee;
use ieee.std_logic_1164.all;


entity xor_testbench is
end xor_testbench;


architecture testbench of xor_testbench is
    component xor_gate is
        port(
            A, B: in std_logic;
            S: out std_logic
        );
    end component;
    -- Inputs
    signal A: std_logic := '0';
    signal B: std_logic := '0';
    -- Outputs
    signal S: std_logic;
begin
    UUT: xor_gate port map(
        A => A,
        B => B,
        S => S
    );
    test: process
    begin
        A <= '0', '1' after 20 ns, '0' after 40 ns, '1' after 60 ns;
        B <= '0', '1' after 40 ns;
    end process;
end testbench;
