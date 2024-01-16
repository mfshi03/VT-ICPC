MOD = 10**9 + 7 

def count_interesting_numbers(a, b):
    dp = [[[0 for _ in range(225)] for _ in range(a + 1)] for _ in range(10)]
    
    for i in range(10):
        dp[i][1][i % 225] = 1

    for length in range(2, a + 1): 
        for last_digit in range(10): 
            for mod in range(225):  
                for next_digit in range(10): 
                    if next_digit != last_digit:
                        new_mod = (mod * 10 + next_digit) % 225
                        dp[next_digit][length][new_mod] += dp[last_digit][length - 1][mod]
                        dp[next_digit][length][new_mod] %= MOD

    result = sum(dp[digit][a][b % 225] for digit in range(10)) % MOD
    return result

print(count_interesting_numbers(100, 87)) 
print(count_interesting_numbers(10, 87))    