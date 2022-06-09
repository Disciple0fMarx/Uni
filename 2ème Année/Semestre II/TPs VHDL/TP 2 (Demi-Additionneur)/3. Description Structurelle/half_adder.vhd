library ieee;
use ieee.std_logic_1164.all;


entity half_adder is
    port(
        A, B: in std_logic;
        S, Cout: out std_logic
    );
end half_adder;


architecture composition of half_adder is
    component xor_gate is
        port(
            A, B: in std_logic;
            S: out std_logic
        );
    end component;
    component and_gate is
        port(
            A, B: in std_logic;
            S: out std_logic
        );
    end component;
begin
    C1: xor_gate port map(A, B, S);
    C2: and_gate port map(A, B, Cout);
end composition;
