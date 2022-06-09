library ieee;
use ieee.std_logic_1164.all;
use ieee.std_logic_arith.all;


entity half_adder is
    port(
        A, B: in std_logic;
        S, Cout: out std_logic
    );
end half_adder;


architecture behavior of half_adder is
begin
    process(A, B)
        variable n: integer := 0;
        constant SUM: std_logic_vector(3 downto 0) := "0110";
        constant CARRY_OUT: std_logic_vector(3 downto 0) := "1000";
    begin
        if A = '1' then n := n + 2; end if;
        if B = '1' then n := n + 1; end if;
        S <= SUM(n);
        Cout <= CARRY_OUT(n);
    end process;
end behavior;
