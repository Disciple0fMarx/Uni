library ieee;
use ieee.std_logic_1164.all;


entity testbench is
end testbench;


architecture bench of testbench is
    component not_gate is
        port(
            X: in std_logic;
            Y: out std_logic
        );
    end component;
    -- Inputs
    signal X: std_logic := '0';
    -- Outputs
    signal Y: std_logic;
begin
    UUT: not_gate port map(
        X => X,
        Y => Y
    );
    test: process
    begin
        X <= '0', '1' after 30 ns;
    end process;
end bench;
