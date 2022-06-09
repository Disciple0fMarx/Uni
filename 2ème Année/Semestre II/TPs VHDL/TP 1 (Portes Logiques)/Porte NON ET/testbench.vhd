library ieee;
use ieee.std_logic_1164.all;


entity testbench is
end testbench;


architecture bench of testbench is
    component nand_gate is
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
    UUT: nand_gate port map(
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
