# -*- coding: cp1252 -*-
import operator
#Filtro de municipio###########################
def byMunicipio(escolas, municipio, Qn):
    escolasF = []
    for line in escolas:
        if line[2] == municipio:
            escolasF.append(line)
    return escolasF[:Qn]

#Filtro de unidade federativa###########################
def byUF(escolas, uf, Qn):
    escolasF = []
    for line in escolas:
        if line[3] == uf:
            escolasF.append(line)
    return escolasF[:Qn]

#Filtro de rede###########################
def byRede(escolas, rede):
    escolasF = []
    if rede == 1:
        return escolas
    if rede == 2:
        for line in escolas:
            if line[4] == "Privada":
                escolasF.append(line)
    if rede == 3:
        for line in escolas:
            if line[4] == "Federal":
                escolasF.append(line)
    if rede == 4:
        for line in escolas:
            if line[4] == "Estadual":
                escolasF.append(line)
    if rede == 5:
        for line in escolas:
            if line[4] == "Municipal":
                escolasF.append(line)
                
    return escolasF

#Filtro de nome###########################
def byNome(escolas, nome):
    escolasF = []
    for line in escolas:
        if nome in line[1]:
            escolasF.append(line)
    return escolasF

#Filtro de nome###########################
def media(escolas, municipeCode, typeCode):
    value = 0
    cont = 0
    for line in escolas:
        if line[typeCode] == municipeCode:
            value = value + ((line[7]+line[12])/2)
            cont = cont + 1 
    value = value/cont
    return value

#Ordenação
def sort(escolas, mCode, Qn, rev):
    mCode = mCode + 7
    escolasF = sorted(escolas, key = lambda escolas:escolas[mCode], reverse=rev)
    return escolasF[:Qn]
        

