library ieee;
use ieee.std_logic_1164.all;


entity or_gate is
    port(
        X, Y: in std_logic;
        Z: out std_logic
    );
end or_gate;


architecture rtl of or_gate is
begin
    Z <= X or Y;
end rtl;
