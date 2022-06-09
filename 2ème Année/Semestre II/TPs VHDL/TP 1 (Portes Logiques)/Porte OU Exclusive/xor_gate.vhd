library ieee;
use ieee.std_logic_1164.all;


entity xor_gate is
    port(
        X, Y: in std_logic;
        Z: out std_logic
    );
end xor_gate;


architecture rtl of xor_gate is
begin
    Z <= X xor Y;
end rtl;
