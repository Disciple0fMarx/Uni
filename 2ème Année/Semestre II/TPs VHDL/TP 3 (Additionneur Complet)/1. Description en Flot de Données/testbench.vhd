library IEEE;
use IEEE.std_logic_1164.all;
use IEEE.std_logic_arith.all;


entity testbench is
end testbench;


architecture bench of testbench is
	component full_adder is
    	port(
    		A, B, Cin: in std_logic;
        	S, Cout: out std_logic
    	);
    end component;
    
    -- Inputs
    signal A: std_logic := '0';
    signal B: std_logic := '0';
    signal Cin: std_logic := '0';
    
    -- Outputs
    signal S: std_logic;
    signal Cout: std_logic;
begin
	UUT: full_adder port map(
    	A => A,
        B => B,
        Cin => Cin,
        S => S,
        Cout => Cout
    );
    test: process
    begin
        A <= '0', '1' after 80 ns;
        B <= '0', '1' after 40 ns, '0' after 80 ns, '1' after 120 ns;
        Cin <= '0', '1' after 20 ns, '0' after 40 ns, '1' after 60 ns, '0' after 80 ns, '1' after 100 ns, '0' after 120 ns, '1' after 140 ns;
    end process;
end bench;
