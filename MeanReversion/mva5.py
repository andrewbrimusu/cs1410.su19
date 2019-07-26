class StockTrader:
    def __init__(self):
        self.f = open('prices/disney.txt', 'r')
        self.lines = self.f.read().splitlines()
        
        self.prcs=[]
        for line in self.lines: self.prcs.append(float(line))
        
        self.i=0
        self.buy=0.0
        self.profit=0.0
        self.buys=0
        self.sells=0
        self.mva5=0.0
        self.firstbuy=0.0
        
    def trade(self):
        for self.p in self.prcs:
            if(self.i>5):
                self.mva5=(self.prcs[self.i-1]+self.prcs[self.i-2]+self.prcs[self.i-3]+self.prcs[self.i-4]+self.prcs[self.i-5])/5.0
                if(self.p>self.mva5 and self.buy==0.0):
                    self.buy=self.p 
                    print("we bought at price: ",self.p)
                    self.buys+=1
                    if(self.firstbuy==0.0): self.firstbuy=self.buy
                elif(self.p<self.mva5 and self.buy!=0.0):
                    self.profit+=(self.p-self.buy)
                    self.buy=0.0
                    print("we sold at price: ",self.p)
                    self.sells+=1
                else: # don't buy/sell
                    pass
                
            self.i+=1
        print("firstbuy: ",self.firstbuy)
        print("Num buys: ",self.buys)
        print("Num sells: ",self.sells)
        print("Total profit: ",self.profit)
        print("Annual returns: ",self.profit/self.firstbuy)

def main():
    stockTrader1 = StockTrader()
    stockTrader1.trade()
    
    
main()



