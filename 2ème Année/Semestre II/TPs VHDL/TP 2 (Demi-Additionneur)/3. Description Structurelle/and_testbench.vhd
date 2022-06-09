library ieee;
use ieee.std_logic_1164.all;


entity and_testbench is
end and_testbench;


architecture testbench of and_testbench is
    component and_gate is
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
    UUT: and_gate port map(
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
