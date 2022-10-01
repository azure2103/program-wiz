import random as r
'''
 X | X | X
---+---+---
 X | X | X
---+---+---
 X | X | X
'''

def printlist(l):
    for i in range(0,3,1):
        for j in range(0,3,1):
            if (l[i][j]=='$'):
                print("   ",end='')
            else:
                print("",l[i][j],"",end='')
            
            if (j<2):
                print("|",end='')
        print()
        if (i<2):
            print("---+---+---")


def checkWinner(l):
    for i in l:
        if (i[0]==i[1]==i[2]=='X'):
            print("\n************ YOU WIN ************\n")
            return 'n'
        elif (i[0]==i[1]==i[2]=='O'):
            print("\n************ COMPUTER WINS ************\n")
            return 'n'

    for col in range(0,3,1):
        if (l[0][col]==l[1][col]==l[2][col]=='X'):
            print("\n************ YOU WIN ************\n")
            return 'n'
        elif (l[0][col]==l[1][col]==l[2][col]=='O'):
            print("\n************ COMPUTER WINS ************\n")
            return 'n'
    
    if (l[0][0]==l[1][1]==l[2][2]=='X'):
        print("\n************ YOU WIN ************\n")
        return 'n'
    elif (l[0][0]==l[1][1]==l[2][2]=='O'):
        print("\n************ COMPUTER WINS ************\n")
        return 'n'
    
    if (l[0][2]==l[1][1]==l[2][0]=='X'):
        print("\n************ YOU WIN ************\n")
        return 'n'
    elif (l[0][2]==l[1][1]==l[2][0]=='O'):
        print("\n************ COMPUTER WINS ************\n")
        return 'n'

    #if nothing worked return y
    return 'y'


l= [[0,0],[0,1],[0,2],
    [1,0],[1,1],[1,2],
    [2,0],[2,1],[2,2],
    ]

entry = [['$','$','$'],['$','$','$'],['$','$','$']]
op = 'y' ;

print("Simple Tic-Tac-Toe game OX")
print("---You vs the Computer ----")



while( len(l)!=0 and op=='y'):
    print("Current matrix :")
    printlist(entry)
    print("\n--- Enter move ---")
    movecheck = True
    
    while(movecheck):
        row = int(input("Enter next row index : ")) 
        col = int(input("Enter next column index : ")) 
        m = [row,col]
        if (m not in l):
            print("\n\n*** Wrong move ***")
            print("--- Enter again ---")
        else:
            movecheck=False
    
    entry[row][col] = 'X'
    l.remove([row,col])

    print("\n~~~~~~~~~~~~~~~~~~")
    printlist(entry)
    print("~~~~~~~~~~~~~~~~~~")

    op = checkWinner(entry)
    if (op=='n'):
        break

    #check winner

    print("\n\n---Computer's turn :")

    comp = l[ r.randint(0,len(l)-1) ]
    crow = comp[0]
    ccol = comp[1]
    entry[crow][ccol] = 'O'
    l.remove(comp)
    print("---Computer chose :",crow,',',ccol,"\n")

    #check winner

if (len(l)==0 and op=='y'):
    print("No moves left :(")