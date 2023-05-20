# day1-java--recursion-memoization-

Pascal triangle is done using 

->Iterative method
->Recursive method
->Memoization

Iterative:
pr is initially declared as 1
row(i) is iterated from 0 to n-1 and column(j) is iterated from 0 to i+1.
if j==0(first column in every row) ,print pr=1
else formula used pr=pr*(i-j+1)/j;
eg:i=2,j=1;

pr=1*(2-1+1)/1;

pr=2;


--------------------------------------------------------------------------------------------------------------------------------------------------------------
Recursive:

we have declared and called a function pascal with arguments i,j.

if i==j or j==0 or i==0(first or last element or element in 1st row),return 1 

else
return pascal(i-1,j)+pascal(i-1,j-1)

eg:i=2,j=2

return pascal(1,2)+pascal(1,1)

pascal(1,2)-->pascal(0,1)

pascal(1,1)=1

pascal(0,1)->1

Therefore,pascal(1,2)=1

and pascal(2,2)=1+1=2

------------------------------------------------------------------------------------------------------------------------------------------------------------

Memoization

let we declare 2d array "arr" with row n,column->n+1

initially all will be zero

arr[0][1]=1;
and we insert it inside pascal(2d list)

iterate from 1 to n(rows)

iterate from 1 to i+1

and then arr[i][j]=arr[i-1][j]+arr[i-1][j-1]

then arr[i][j] inserted in pascal list

Finally,print pascal list


