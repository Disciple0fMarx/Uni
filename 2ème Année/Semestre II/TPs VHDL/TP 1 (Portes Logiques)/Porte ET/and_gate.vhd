library ieee;
use ieee.std_logic_1164.all;


entity and_gate is
    port(
        X, Y: in std_logic;
        Z: out std_logic
    );
end and_gate;


architecture rtl of and_gate is
begin
    Z <= X and Y;
end rtl;
