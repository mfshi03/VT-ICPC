n = int(input())

controlA = 0
controlB = 0
controlC = 0

vaccA = 0
vaccB = 0
vaccC = 0

infvacA = 0
infvacB = 0
infvacC = 0

infconA = 0
infconB = 0
infconC = 0

def comparefloats(f1, f2):
    return abs(f1 - f2) <= .00000

totalC = 0
for i in range(n):
    l = input()
    #print(l)
    vaccinated = l[0] == 'Y'
    infectedA = l[1] == 'Y'
    infectedB = l[2] == 'Y'
    infectedC = l[3] == 'Y'
    #print(vaccinated, infectedA, infectedB, infectedC)
    if(vaccinated):
        vaccA += 1
        vaccB += 1
        vaccC += 1
        if infectedA:
            infvacA += 1 
        if infectedB:
            infvacB += 1 
        if infectedC:
            infvacC += 1    
    else:
        controlA += 1
        controlB += 1 
        controlC += 1
        if infectedA:
            infconA += 1 
        if infectedB:
            infconB += 1 
        if infectedC:
            infconC += 1    
    

rateVA = infvacA/vaccA
rateVB = infvacB/vaccB
rateVC = infvacC/vaccC

    
rateCA = infconA/controlA
rateCB = infconB/controlB
rateCC = infconC/controlC
if rateVA >= rateCA:
    print("Not Effective")
else:
    print(((rateCA - rateVA)/rateCA)*100)
        
if rateVB >= rateCB:
    print("Not Effective")
else:
    print(((rateCB - rateVB)/rateCB)*100)
        
if rateVC >= rateCC:
    print("Not Effective")
else:
    print(((rateCC - rateVC)/rateCC)*100)