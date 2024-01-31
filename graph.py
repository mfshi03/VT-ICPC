import os

from autokattis import Kattis
from dotenv import load_dotenv
import shutil

load_dotenv(".env")

desc = """
Problems I have solved on [Kattis](https://open.kattis.com) for VT-ICPC.\n
Make sure to check this only if you have no furthur ideas.\n
> [!TIP]
>
> "The ideal problem is the problem you can barely solve given an infinite amount of time"
>
> - Walden Yan (IOI Gold Medalist)
"""

table = """
<table>
<thead>
<td>Name</td>
<td>Difficulty</td>
<td>Link</td>
</thead>
<tbody>
"""

tableFormat = """
<tr>
<td>{name}</td>
<td>{difficulty}</td>
<td>{link}</td>
</tr>
"""

tableEnd = """
</tbody>
</table>
"""
print(os.environ.get("K_USER"))
kt = Kattis(os.environ.get("K_USER"), os.environ.get("K_PASS"))

with open("README.md", 'w') as obj:
    obj.write("# mfshi03 Kattis Problems\n")

    obj.write(desc)

    kt.plot_problems(filepath="plot.png", show_partial=False)
    obj.write("### Problem Difficulty\n")

    obj.write("![](plot.png)")

    problems = kt.problems(show_partial=False)

    obj.write(table)
    for p in problems:
        obj.write(tableFormat.format(**p))