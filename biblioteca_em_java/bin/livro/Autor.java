����   2 =  livro/Autor  java/lang/Object id I nome Ljava/lang/String; nacionalidade <init> ((ILjava/lang/String;Ljava/lang/String;)V Code
   
  ()V	    	    	   	  LineNumberTable LocalVariableTable this Llivro/Autor; getId ()I setId (I)V getNome ()Ljava/lang/String; setNome (Ljava/lang/String;)V getNacionalidade setNacionalidade toString & java/lang/StringBuilder ( Autor {ID: 
 % * 
 !
 % , - . append (I)Ljava/lang/StringBuilder; 0 	, Nome: '
 % 2 - 3 -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 % 5 - 6 (C)Ljava/lang/StringBuilder; 8 , Nacionalidade: '
 % : $  
SourceFile 
Autor.java !                 	      
      l     *� *� *,� *-� �           	  
 	         *                        	          /     *� �                               >     *� �       
                                /     *� �                           !     >     *+� �       
                          "      /     *� �                          # !     >     *+� �       
    $  %                	    $      y     ;� %Y'� )*� � +/� 1*� � 1'� 47� 1*� � 1'� 4}� 4� 9�           + 	 ,  - ! . 2 / 7 +        ;      ;    <