import java.util.Scanner;

public class Main1{
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int quantAdic, retirada, valor, valorTamanho, opcao, sabor, adicional, embalagem;
        String adicionaldois, enderecodois, tamanho, sabor1, segSabor, emaildois, segAdicional, adicionalTres, numero;

        System.out.println(
                "Bom dia, somos o Universo do açaí, vamos realizar o seu pedido? Para açaí digite 1, para sorvete digite 2 e para milkshake digite 3");
        opcao = input.nextInt();
        if (opcao == 1) {
            System.out.println("Escolha o tamanho do seu açaí, pequeno (6), médio (8), grande (10)");
            tamanho = input.next();
            System.out.println("Digite o valor do tamanho do seu açaí");
            valorTamanho = input.nextInt();
            System.out.println(
                    "Cada adicional do seu açaí são 2 reais, podendo colocar até três adicionais. Você deseja colocar algum adicional no seu açaí? Se sim digite 1, se não digite 2");
            adicional = input.nextInt();
            if (adicional == 1) {
                System.out.println("Quantos adicionais você deseja? No caso de menos de três adicionais, digite 0 na opção que não haverá adicional");
                quantAdic = input.nextInt();
                System.out.println(
                        "Escreva o primeiro adicional que você deseja, temos Chocolate, Paçoca, Morango, Castanhas e Granola");
                adicionaldois = input.next();
                System.out.println("Escolha o segundo adicional:");
                segAdicional = input.next();
                System.out.println("Escolha o terceiro adicional:");
                adicionalTres = input.next();
                System.out.println(
                        "Para entrega, o valor do frete é de 5 reais, para retirada na loja digite 1 e para entrega digite 2");
                retirada = input.nextInt();
                if (retirada == 1) {  
                    valor = valorTamanho + quantAdic * 2;
                    System.out.println("Seu pedido para retirada foi um açaí:");
                    System.out.println(tamanho);
                    System.out.println("Com:"+adicionaldois+", "+segAdicional+" e "+adicionalTres);
                    System.out.println("No valor de: " +valor+ " reais");
                    System.out.println(
                            "Obrigada pela prefêrencia, entre 10-20 minutos você já pode retirar o seu pedido na loja e realizar seu pagamento, volte sempre!!");
                } else {
                    System.out.println("Digite o CEP entrega:");
                    enderecodois = input.next();
                    System.out.println("Digite o número da residência:");
                    numero = input.next();
                    System.out.println("Digite seu email:");
                    emaildois = input.next();
                    System.out.println(
                            "Você deseja que seu pedido seja entregue em uma embalagem térmica por mais 1 real ? A embalagem térmica garante uma melhor conservação do açaí mantendo sua temperatura . Se deseja a embalagem térmica digite 1, se não digite 2");
                    embalagem = input.nextInt();
                    if (embalagem == 1) {
                        valor = valorTamanho + quantAdic * 2 + 5 + 1;
                        System.out.println("Seu pedido para entrega foi um açaí com embalagem térmica:");
                        System.out.println(tamanho);
                        System.out.println("Com:"+adicionaldois+", "+segAdicional+" e "+adicionalTres);
                        System.out.println("No valor de: " +valor+ " reais");
                        System.out.println("Para entrega no CEP:"+enderecodois+", Número da residência: "+numero);
                        System.out.println("Email do Cliente:");
                        System.out.println(emaildois);
                        System.out.println(
                                "Obrigada pela prefêrencia, dentro de alguns minutos  você receberá um e-mail para confirmação do pedido e realizar o pagamento. Entre 30-40 minutos o seu pedido será entregue, bom apetite!!");
                    } else {
                        valor = valorTamanho + quantAdic * 2 + 5;
                        System.out.println("Seu pedido para entrega foi um açaí:");
                        System.out.println(tamanho);
                        System.out.println("Com:"+adicionaldois+", "+segAdicional+" e "+adicionalTres);
                        System.out.println("No valor de: " +valor+ " reais");
                        System.out.println("Para entrega no CEP:"+enderecodois+", Número da residência: "+numero);
                        System.out.println("Email do Cliente:");
                        System.out.println(emaildois);
                        System.out.println(
                                "Obrigada pela prefêrencia, dentro de alguns minutos  você receberá um e-mail para confirmação do pedido e realizar o pagamento. Entre 30-40 minutos o seu pedido será entregue, bom apetite!!");
                    }
                }
            } else {
                System.out.println(
                        "Para entrega, o valor do frete é de 5 reais, para retirada na loja digite 1 e para entrega digite 2");
                retirada = input.nextInt();
                if (retirada == 1) {
                    System.out.println("Seu pedido para retirada foi um açaí sem adicional:");
                    System.out.println(tamanho);
                    System.out.println("No valor de: " +valorTamanho+ " reais");
                    System.out.println(
                            "Obrigada pela prefêrencia, entre 10-20 minutos você já pode retirar o seu pedido na loja e realizar seu pagamento, volte sempre!!");
                } else {
                    System.out.println("Digite o CEP entrega:");
                    enderecodois = input.next();
                    System.out.println("Digite o número da residência:");
                    numero = input.next();
                    System.out.println("Digite seu email:");
                    emaildois = input.next();

                    System.out.println(
                            "Você deseja que seu pedido seja entregue em uma embalagem térmica por mais 1 real ? A embalagem térmica garante uma melhor conservação do açaí mantendo sua temperatura . Se deseja a embalagem térmica digite 1, se não digite 2");
                    embalagem = input.nextInt();
                    if (embalagem == 1) {
                        valor = valorTamanho + 5 + 1;
                        System.out.println("Seu pedido para entrega foi um açaí sem adicional com embalagem térmica:");
                        System.out.println(tamanho);
                        System.out.println("No valor de: " +valor+ " reais");
                        System.out.println("Para entrega no CEP:"+enderecodois+", Número da residência: "+numero);
                        System.out.println("Email do Cliente:");
                        System.out.println(emaildois);
                        System.out.println(
                                "Obrigada pela prefêrencia, dentro de alguns minutos  você receberá um e-mail para confirmação do pedido e realizar o pagamento. Entre 30-40 minutos o seu pedido será entregue, bom apetite!!");
                    } else {
                        valor = valorTamanho + 5;
                        System.out.println("Seu pedido para entrega foi um açaí sem adicional:");
                        System.out.println(tamanho);
                        System.out.println("No valor de: " +valor+ " reais");
                        System.out.println("Para entrega no CEP:"+enderecodois+", Número da residência: "+numero);
                        System.out.println("Email do Cliente:");
                        System.out.println(emaildois);
                        System.out.println(
                                "Obrigada pela prefêrencia, dentro de alguns minutos  você receberá um e-mail para confirmação do pedido e realizar o pagamento. Entre 30-40 minutos o seu pedido será entregue, bom apetite!!");
                    }
                }
            }
        } else {
            if (opcao == 2) {
                System.out.println("Escolha o tamanho do seu sorvete, 300ml (10), 450ml (12), 700ml (16)");
                tamanho = input.next();
                System.out.println("Digite o valor do tamanho do seu sorvete");
                valorTamanho = input.nextInt();
                System.out.println(
                        "Escolha o sabor do seu sorvete temos Creme, Cookies, Chocolate, Menta, Baunilha, Morango, Pistache,  Flocos, Nutella, Trufado, Abacaxi, Brigadeiro, Chiclete,  Maracujá, Côco e Sensação");
                sabor1 = input.next();
                System.out.println("Cada adicional do seu sorvete é 1 real, podendo escolher até duas adicionais, quantos adicionais você deseja?");
                quantAdic = input.nextInt();
                System.out.println(
                        "Escreva o primeiro adicional que você deseja, temos Morango, Calda, Granola, Paçoca, Óreo, Nozes, Jujubas, Marshmallow. No caso de menos de dois adicionais, digite 0 na opção que não haverá adicional");
                adicionaldois = input.next();
                System.out.println("Escolha o segundo adicional:");
                segAdicional = input.next();
                System.out.println(
                        "Para entrega, o valor do frete é de 5 reais, para retirada na loja digite 1 e para entrega digite 2");
                retirada = input.nextInt();
                if (retirada == 1) {
                    valor = valorTamanho + quantAdic * 1;
                    System.out.println("Seu pedido para retirada foi um sorvete de:");
                    System.out.println(tamanho);
                    System.out.println("De");
                    System.out.println(sabor1);
                    System.out.println("Com:"+adicionaldois+" e "+segAdicional);
                    System.out.println("No valor de: " +valor+ " reais");
                    System.out.println(
                            "Obrigada pela prefêrencia, entre 10-20 minutos você já pode retirar o seu pedido na loja e realizar seu pagamento, volte sempre!!");
                } else {
                    System.out.println("Digite o CEP entrega:");
                    enderecodois = input.next();
                    System.out.println("Digite o número da residência:");
                    numero = input.next();
                    System.out.println("Digite seu email:");
                    emaildois = input.next();

                    System.out.println(
                            "Você deseja que seu pedido seja entregue em uma embalagem térmica por mais 1 real ? A embalagem térmica garante uma melhor conservação do sorvete mantendo sua temperatura . Se deseja a embalagem térmica digite 1, se não digite 2");
                    embalagem = input.nextInt();
                    if (embalagem == 1) {
                        valor = valorTamanho + quantAdic * 1 + 1 + 5;
                        System.out.println("Seu pedido para entrega foi um sorvete com embalagem térmica de:");
                        System.out.println(tamanho);
                        System.out.println("De");
                        System.out.println(sabor1);
                        System.out.println("Com:"+adicionaldois+" e "+segAdicional);
                        System.out.println("No valor de: " +valor+ " reais");
                        System.out.println("Para entrega no CEP:"+enderecodois+", Número da residência: "+numero);
                        System.out.println("Email do Cliente:");
                        System.out.println(emaildois);
                        System.out.println(
                                "Obrigada pela prefêrencia, dentro de alguns minutos  você receberá um e-mail para confirmação do pedido e realizar o pagamento. Entre 30-40 minutos o seu pedido será entregue, bom apetite!!");
                    } else {
                        valor = valorTamanho + quantAdic * 1 + 5;
                        System.out.println("Seu pedido para entrega foi um sorvete de:");
                        System.out.println(tamanho);
                        System.out.println("De");
                        System.out.println(sabor1);
                        System.out.println("Com:"+adicionaldois+" e "+segAdicional);
                        System.out.println("No valor de: " +valor+ " reais");
                        System.out.println("Para entrega no CEP:"+enderecodois+", Número da residência: "+numero);
                        System.out.println("Email do Cliente:");
                        System.out.println(emaildois);
                        System.out.println(
                                "Obrigada pela prefêrencia, dentro de alguns minutos  você receberá um e-mail para confirmação do pedido e realizar o pagamento. Entre 30-40 minutos o seu pedido será entregue, bom apetite!!");
                    }
                }
            } else {
                System.out.println("Escolha o tamanho do seu MilkShake, 300ml (10), 450ml (12), 700ml (16)");
                tamanho = input.next();
                System.out.println("Digite o valor do tamanho do seu MilkShake");
                valorTamanho = input.nextInt();
                System.out.println(
                        "Para um sabor de sorvete digite 1, para dois sabores digite 2, com um acréscimo de 1 real");
                sabor = input.nextInt();
                if (sabor == 1) {
                    System.out.println(
                            "Escolha o sabor do seu MilkShake: Creme, Cookies, Chocolate, Menta, Baunilha, Morango, Pistache, BlueIce, Flocos, Nutella, Trufado, Abacaxi, Brigadeiro, Chiclete,  Maracujá, Côco, Sensação.");
                    sabor1 = input.next();
                   System.out.println(
                            "Escolha a calda adiconal de: Morango, Amêndoim, Chocolate, Caramelo, Nutella, Maracujá ");
                    adicionaldois = input.next();
                    System.out.println(
                            "Pronto! Para entrega, o valor do frete é de 5 reais, para retirada na loja digite 1 e para entrega digite 2");
                    retirada = input.nextInt();
                    if (retirada == 1) {
                        System.out.println("Seu pedido para retirada foi um MilShake  de:");
                        System.out.println(tamanho);
                        System.out.println("De:");
                        System.out.println(sabor1);
                        System.out.println("Com");
                        System.out.println(adicionaldois);
                        System.out.println("No valor de: " +valorTamanho+ " reais");
                        System.out.println(
                                "Obrigada pela prefêrencia, entre 10-20 minutos você já pode retirar o seu pedido na loja e realizar seu pagamento, volte sempre!!");
                    } else {
                        System.out.println("Digite o CEP entrega:");
                        enderecodois = input.next();
                        System.out.println("Digite o número da residência:");
                        numero = input.next();
                        System.out.println("Digite seu email:");
                        emaildois = input.next();

                        System.out.println(
                                "Você deseja que seu pedido seja entregue em uma embalagem térmica por mais 1 real ? A embalagem térmica garante uma melhor conservação do MilkShake mantendo sua temperatura . Se deseja a embalagem térmica digite 1, se não digite 2");
                        embalagem = input.nextInt();
                        if (embalagem == 1) {
                            valor = valorTamanho + 1 + 5;
                            System.out.println("Seu pedido para entrega foi um MilShake em embalagem térmica de:");
                            System.out.println(tamanho);
                            System.out.println("De:");
                            System.out.println(sabor1);
                            System.out.println("Com:");
                            System.out.println(adicionaldois);
                            System.out.println("No valor de: " +valor+ " reais");
                            System.out.println("Para entrega no CEP:"+enderecodois+", Número da residência: "+numero);
                            System.out.println("Email do Cliente:");
                            System.out.println(emaildois);
                            System.out.println(
                                    "Obrigada pela prefêrencia, dentro de alguns minutos  você receberá um e-mail para confirmação do pedido e realizar o pagamento. Entre 30-40 minutos o seu pedido será entregue, bom apetite!!");
                        } else {
                            valor = valorTamanho + 5;
                            System.out.println("Digite o CEP entrega:");
                            enderecodois = input.next();
                            System.out.println("Digite o número da residência:");
                            numero = input.next();
                            System.out.println("Seu pedido para entrega foi um MilShake de:");
                            System.out.println(tamanho);
                            System.out.println("De:");
                            System.out.println(sabor1);
                            System.out.println("Com:");
                            System.out.println(adicionaldois);
                            System.out.println("No valor de: " +valor+ " reais");
                            System.out.println("Para entrega no CEP:"+enderecodois+", Número da residência: "+numero);
                            System.out.println("Email do Cliente:");
                            System.out.println(emaildois);
                            System.out.println(
                                    "Obrigada pela prefêrencia, dentro de alguns minutos  você receberá um e-mail para confirmação do pedido e realizar o pagamento. Entre 30-40 minutos o seu pedido será entregue, bom apetite!!");
                        }
                    }
                } else {
                    System.out.println(
                            "Escolha o primeiro sabor do seu MilkShake: Creme, cookies, Chocolate, Menta, Chocolate, Baunilha, Morango, Pistache, BlueIce, Flocos, Nutella, Trufado, Abacaxi, Brigadeiro, Chiclete,  Maracujá, Côco, Sensação.");
                    sabor1 = input.next();
                    System.out.println("Escolha o segundo sabor:");
                    segSabor = input.next();
                    System.out.println(
                            "Escolha a calda adiconal de: Morango, Amêndoim, Chocolate, Caramelo, Nutella, Maracujá ");
                    adicionaldois = input.next();
                    System.out.println(
                            "Pronto! Para entrega, o valor do frete é de 5 reais, para retirada na loja digite 1 e para entrega digite 2");
                    retirada = input.nextInt();
                    if (retirada == 1) {
                        valor = valorTamanho + 1;
                        System.out.println("Seu pedido para retirada foi um MilShake de:");
                        System.out.println(tamanho);
                        System.out.println("De: " + sabor1 + " e " + segSabor );
                        System.out.println("Com:");
                        System.out.println(adicionaldois);
                        System.out.println("No valor de: " +valor+ " reais");
                        System.out.println(
                                "Obrigada pela prefêrencia, entre 10-20 minutos você já pode retirar o seu pedido na loja e realizar seu pagamento, volte sempre!!");
                    } else {
                        System.out.println("Digite o CEP entrega:");
                        enderecodois = input.next();
                        System.out.println("Digite o número da residência:");
                        numero = input.next();
                        System.out.println("Digite seu email:");
                        emaildois = input.next();

                        System.out.println(
                                "Você deseja que seu pedido seja entregue em uma embalagem térmica por mais 1 real ? A embalagem térmica garante uma melhor conservação do MilkShake mantendo sua temperatura . Se deseja a embalagem térmica digite 1, se não digite 2");
                        embalagem = input.nextInt();
                        if (embalagem == 1) {
                            valor = valorTamanho + 1 + 5;
                            System.out.println("Seu pedido para entrega foi um MilShake em embalagem térmica de:");
                            System.out.println(tamanho);
                            System.out.println("De: " + sabor1 + " e " + segSabor );
                            System.out.println("Com:");
                            System.out.println(adicionaldois);
                            System.out.println("No valor de: " +valor+ " reais");
                            System.out.println("Para entrega no CEP:"+enderecodois+", Número da residência: "+numero);
                            System.out.println("Email do Cliente:");
                            System.out.println(emaildois);
                            System.out.println(
                                    "Obrigada pela prefêrencia, dentro de alguns minutos  você receberá um e-mail para confirmação do pedido e realizar o pagamento. Entre 30-40 minutos o seu pedido será entregue, bom apetite!!");
                        } else {
                            valor = valorTamanho + 5;
                            System.out.println("Seu pedido para entrega foi um MilShake de:");
                            System.out.println(tamanho);
                            System.out.println("De: " + sabor1 + " e " + segSabor );
                            System.out.println("Com:");
                            System.out.println(adicionaldois);
                            System.out.println("No valor de: " +valor+ " reais");
                            System.out.println("Para entrega no CEP:"+enderecodois+", Número da residência: "+numero);
                            System.out.println("Email do Cliente:");
                            System.out.println(emaildois);
                            System.out.println(
                                    "Obrigada pela prefêrencia, dentro de alguns minutos  você receberá um e-mail para confirmação do pedido e realizar o pagamento. Entre 30-40 minutos o seu pedido será entregue, bom apetite!!1");
                        }
                    }
                }
            }
        }
       
    }
}
