library ieee;
use ieee.std_logic_1164.all;


entity nor_gate is
    port(
        X, Y: in std_logic;
        Z: out std_logic
    );
end nor_gate;


architecture rtl of nor_gate is
begin
    Z <= X nor Y;
end rtl;
