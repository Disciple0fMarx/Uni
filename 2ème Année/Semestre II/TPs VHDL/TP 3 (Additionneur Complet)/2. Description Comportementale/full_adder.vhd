library ieee;
use ieee.std_logic_1164.all;
use ieee.std_logic_arith.all;


entity full_adder is
	port(
    	A, B, Cin: in std_logic;
        S, Cout: out std_logic
    );
end full_adder;


architecture behavior of full_adder is
begin
	process(A, B, Cin)
    	variable n: integer := 0;
        constant SUM: std_logic_vector(7 downto 0) := "10010110";
        constant CARRY_OUT: std_logic_vector(7 downto 0) := "11101000";
    begin
    	if A = '1' then n := n + 4; end if;
        if B = '1' then n := n + 2; end if;
        if Cin = '1' then n := n + 1; end if;
        S <= SUM(n);
        Cout <= CARRY_OUT(n);
    end process;
end behavior;
