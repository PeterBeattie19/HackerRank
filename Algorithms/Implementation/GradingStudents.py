import os
import sys

def gradingStudents(grades):
    res = []
    for i in grades:
        if i < 38:
            res.append(i)
        elif i%10 == 3 or i%10 == 4:
            res.append(i - i%10 + 5)
        elif i%10 == 8 or i%10 == 9:
            res.append(i - i%10 + 10)
        else:
            res.append(i) 
    return res

if __name__ == '__main__':
    f = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    grades = []

    for _ in range(n):
        grades_item = int(input())
        grades.append(grades_item)

    result = gradingStudents(grades)

    f.write('\n'.join(map(str, result)))
    f.write('\n')

    f.close()
