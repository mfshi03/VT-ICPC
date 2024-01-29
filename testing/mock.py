import subprocess
import random 

def run_program(program_name, input_string):
    try:
        result = subprocess.run(["python", program_name], input=input_string, text=True, capture_output=True, check=True)
        print(f"Output of {program_name}:")
        print(result.stdout)

    except subprocess.CalledProcessError as e:
        print(f"Error running {program_name}: {e.stderr}")


arr = []

input_seq = "1\n" + "891112"
ans = 2
print(f"Correct Answer: {ans}")
run_program("../python/missingnumber2.py", input_seq)
