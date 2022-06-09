library ieee;
use ieee.std_logic_1164.all;


entity or_testbench is
end or_testbench;


architecture bench of or_testbench is
    component or_gate is
        port(
            X, Y: in std_logic;
            Z: out std_logic
        );
    end component;
    -- Inputs
    signal X: std_logic := '0';
    signal Y: std_logic := '0';
    -- Outputs
    signal Z: std_logic;
begin
    UUT: or_gate port map(
        X => X,
        Y => Y,
        Z => Z
    );
    test: process
    begin
        X <= '0', '1' after 30 ns, '0' after 60 ns, '1' after 90 ns;
        Y <= '0', '1' after 60 ns;
    end process;
end bench;
