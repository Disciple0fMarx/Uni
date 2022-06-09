library ieee;
use ieee.std_logic_1164.all;


entity and_gate is
    port(
        A, B: in std_logic;
        S: out std_logic
    );
end and_gate;


architecture rtl of and_gate is
begin
    S <= A and B;
end rtl;
