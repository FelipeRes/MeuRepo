def drawInfo(vetor, matCode):
    cont = 1
    matCode = matCode + 7
    print "================================"
    #Printa a nota da escola e sua nota
    for value in vetor:
        print cont,"\t",value[matCode],"\t",value[3],"\t",value[1], "\t", value[4]
        cont = cont + 1
    print "================================"




