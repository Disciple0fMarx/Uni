library ieee;
use ieee.std_logic_1164.all;


entity xor_gate is
    port(
        A, B: in std_logic;
        S: out std_logic
    );
end xor_gate;


architecture rtl of xor_gate is
begin
    S <= A xor B;
end rtl;
