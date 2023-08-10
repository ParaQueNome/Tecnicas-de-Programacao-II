## JokenPO do Sheldon Cooper
import random
def menu():

    print('[1] - Pedra ')
    print('[2] - Papel ')
    print('[3] - Tesoura ')
    print('[4] - Lagarto ')
    print('[5] - Spock ')
    print('[6] - Sair')
    escolha = int(input("Escolha a opção: \n"))
    return escolha


def compara(jogador, maquina):

    if jogador == 1:
        if maquina == 3 or maquina == 4:
            print('Você ganhou!')

        else:
            print('Você perdeu!')
    elif jogador == 2:
        if maquina == 5 or maquina == 1:
            print('Você ganhou!')
        else:
            print('Você perdeu!')
    elif jogador == 3:
        if maquina == 2 or maquina == 4:
            print('Você ganhou!')
        else:
            print('Você perdeu!')
    elif jogador == 4:
        if maquina == 5 or maquina == 2:
            print('Você ganhou!')
        else:
            print('Você perdeu!')
    else:
        if maquina == 3 or maquina == 1:
            print('Você ganhou!')
        else:
            print('Você perdeu!')
def main():
    opc = menu()
    while opc != 6:
        var = random.randint(1,5)
        compara(opc, var)
        if var == 1:
            print('Escolha da maquina: Pedra \n')
        elif var == 2:
            print('Escolha da maquina: Papel \n')
        elif var == 3:
            print('Escolha da maquina: Tesoura \n')
        elif var == 4:
            print('Escolha da maquina: Lagarto \n')
        else:
            print('Escolha da maquina: Spock \n')
        opc = menu()


main()