# -*- coding: cp1252 -*-
import os
import filters
import table

file = open("Enem2014.csv")
escolas = []
for l in file:
    escolas.append(l.strip().split(";"))
    
for line in escolas:
    line[0] = float(line[0])
    for col in range(7,13):
        line[col] = float(line[col].replace(",","."))

dicRede = {1:"Todas", 2:"Privada",3:"Federal",4:"Estadual",5:"Municipal"}
###############################################################
op1 = "Top 10 Escolas"
op2 = "Procurar Escola por Nome"
op3 = "Procurar por Municipio"
op4 = "Procurar por UF"
op5 = "Media por Municipio"
op6 = "Media por UF"
op7 = "Buscar por Materia"
op8 = "X"
op9 = "Status"
op10 = "Opções"
def menu():

    print "============= < Enem 2014 >================\n\n"
    print "1 - ",op1
    print "2 - ",op2
    print "3 - ",op3
    print "4 - ",op4
    print "5 - ",op5
    print "6 - ",op6
    print "7 - ",op7
    #print "8 - ",op8
    print "9 - ",op9
    print "10 - ",op10
    print "============= < Enem 2014 >================\n\n"

def menuMateria():
    print "============= < Materias >================\n\n"
    print "0 - Media Geral(Provas Objetivas)"
    print "1 - Linguagens"
    print "2 - Matematica"
    print "3 - Ciências da Natureza"
    print "4 - Ciências Humanas"
    print "5 - Redação"
    print "============= < Materias >================\n\n"
def menuOption():
    print "============= < Options >================\n\n"
    print "1 - Inserir quantidade mostrada"
    print "2 - Mostrar melhores"
    print "3 - Mostrar piores"
    print "4 - Definir tipo de escola"
    print "5 - Sair"
    print "============= < Options >================\n\n"
def menuRede():
    print "============= < Rede >================\n\n"
    print "1 - Todas Escolas"
    print "2 - Somente Privadas"
    print "3 - Somente Federais"
    print "4 - Somente Estaduais"
    print "5 - Mostrar Municipais"
    print "6 - Sair"
    print "============= < Options >================\n\n"
    

################################################################
mCode = 0 #codigo da materia
subKey = 0 #submenu
Qn = 10; # quantidade mostrada
reverse = True #ordem crescente
rede = 1 #publica ou privada 1 = duas, 0 = privada, -1 = publica
while 1:
    #os.system("cls")
    menu()
    key = raw_input("")
    subKey = 0

    if key == "1":
        os.system("cls")
        resultado = escolas[:10]
        table.drawInfo(resultado,mCode)
        a = raw_input("Pressione enter para continuar")
        os.system("cls")
        
        
    if key == "2":
        os.system("cls")
        busca = raw_input("Digite o nome ou parte da escola: ")
        resultado = filters.byRede(escolas, rede)
        resultado = filters.byNome(resultado, busca)
        resultado = filters.sort(resultado, 0, Qn, reverse)
        table.drawInfo(resultado,mCode)
        a = raw_input("Pressione enter para continuar")
        os.system("cls")

    if key == "3":
        os.system("cls")
        busca = raw_input("Digite o nome do municipio: ")
        resultado = filters.byRede(escolas, rede)
        resultado = filters.byMunicipio(resultado, busca, Qn)
        table.drawInfo(resultado,mCode)
        a = raw_input("Pressione enter para continuar")
        os.system("cls")

    if key == "4":
        os.system("cls")
        busca = raw_input("Digite a sigla do estado: ")
        resultado = filters.byRede(escolas, rede)
        resultado = filters.byUF(resultado, busca, Qn)
        table.drawInfo(resultado,mCode)
        a = raw_input("Pressione enter para continuar")
        os.system("cls")

    if key == "5":
        os.system("cls")
        busca = raw_input("Digite o nome do municipio: ")
        resultado = filters.media(escolas, busca, 2)
        print "A media de notas de desse municipio é:  ", resultado
        a = raw_input("Pressione enter para continuar")
        os.system("cls")

    if key == "6":
        os.system("cls")
        busca = raw_input("Digite a sigla da UnidadeFederativa: ")
        resultado = filters.media(escolas, busca, 3)
        print "A media de notas de desse municipio é:  ", resultado, "\n"
        a = raw_input("Pressione enter para continuar")
        os.system("cls")
        
    if key == "7":
        os.system("cls")
        menuMateria()
        busca = int(raw_input("O Codigo da Materia: "))
        resultado = filters.byRede(escolas, rede)
        resultado = filters.sort(resultado, busca, Qn, reverse)
        table.drawInfo(resultado, busca)
        a = raw_input("Pressione enter para continuar")
        os.system("cls")
        
    if key == "10":
        os.system("cls")
        menuOption()
        subKey = int(raw_input())
        if subKey == 1:
             Qn = int(raw_input("Digite a quantidade a ser mostrada nas consultas"))
        if subKey == 2:
             reverse = True
        if subKey == 3:
             reverse = False
        if subKey == 4:
             menuRede()
             rede = int(raw_input())
        if subKey == 5:
            pass
        a = raw_input("Pressione enter para continuar")
        os.system("cls")
    if key == "9":
        os.system("cls")
        print "Quantidade por pesquisa: ", Qn
        if reverse == True:
            print "Ordem: Maior para menor"
        else:
            print "Ordem: Menor para maior"
        print "Rede pesquisada: ", dicRede[rede]
        a = raw_input("Pressione enter para continuar")
        os.system("cls")
        

################################################################
        

