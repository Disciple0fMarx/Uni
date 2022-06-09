library ieee;
use ieee.std_logic_1164.all;


entity full_adder is
	port(
    	A, B, Cin: in std_logic;
        S, Cout: out std_logic
    );
end full_adder;


architecture composition of full_adder is
    component half_adder is
        port(
            A, B: in std_logic;
            S, Cout: out std_logic
        );
    end component;
    
    component or_gate is
        port(
            X, Y: in std_logic;
            Z: out std_logic
        );
    end component;

    -- Outputs
    signal N1: std_logic;
    signal N2: std_logic;
    signal N3: std_logic;
begin
    C1: half_adder port map(A, B, N1, N2);
    C2: half_adder port map(N1, CARRY, S, N3);
    C3: or_gate port map(N2, N3, Cout);
end composition;
