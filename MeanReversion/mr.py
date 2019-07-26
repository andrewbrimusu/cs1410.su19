f = open('prices/disney.txt', 'r')
lines = f.read().splitlines()

prcs=[]
for line in lines: prcs.append(float(line))
 
i=0
buy=0.0
profit=0.0
buys=0
sells=0
for curr in prcs:
    if(i>6):
        mva5=(prcs[i-1]+prcs[i-2]+prcs[i-3]+prcs[i-4]+prcs[i-5]+prcs[i-6])/6.0
        if(curr<mva5*.98and buy==0.0): #buy signal
            print("day",i,"we bought at price: ",curr)
            buys+=1
            buy=curr
        elif(curr>mva5*1.02 and buy!=0.0): #sell signal
            print("day",i,"we sold at price: ",curr)
            print("profit for this trade: ",curr-buy)
            profit+=curr-buy
            sells+=1
            buy=0.0
        else:
            pass
            #print("we're waiting!@!!"
    i+=1
print("Num buys: ",buys)
print("Num sells: ",sells)
print("Total profit: ",profit)
print("Annual returns: ",profit/prcs[0])





