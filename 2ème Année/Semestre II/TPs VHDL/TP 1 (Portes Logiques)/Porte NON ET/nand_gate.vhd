library ieee;
use ieee.std_logic_1164.all;


entity nand_gate is
    port(
        X, Y: in std_logic;
        Z: out std_logic
    );
end nand_gate;


architecture rtl of nand_gate is
begin
    Z <= X nand Y;
end rtl;
