def rendu(montant):#implentation de l algorithme de rendu de monnaire
    tab1=[100,50,25,10,5,1] #le tableau des pieces
    tab2=[500,1000,2000,5000,10000] #le tableau des billets
    renbo=[]  #le tableau contemant les conbinaison des pieces a renbourse 
    while montant>0:
        if montant<500: #le cas des pieces
            for i in range(6):
                while montant>=tab1[i]:
                    renbo.append(tab1[i])
                    montant-=tab1[i]
            break
        else:
            for i in range(5): #cas des billets
                while montant>=tab2[i]:
                    renbo.append(tab2[i])
                    montant-=tab2[i]
            continue
    return renbo        
        
        
x=rendu(1250)
print(x)