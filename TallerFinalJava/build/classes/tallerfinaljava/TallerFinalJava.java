����   = �
      java/lang/Object <init> ()V  java/util/Scanner	 
     java/lang/System in Ljava/io/InputStream;
     (Ljava/io/InputStream;)VA1�@    	 
    out Ljava/io/PrintStream;  Ingrese el número de empleados
      java/io/PrintStream println (Ljava/lang/String;)V
  ! " # nextInt ()I % Digite su nombre completo
  ' ( ) next ()Ljava/lang/String; + Digite su edad - Digite No de horas trabajadas / $Digite No de horas extras trabajadas@>      @       ?�         7 8 9 makeConcatWithConstants (D)Ljava/lang/String;  7  7  7 > FVamos a sacar el rango de numeros que sean primos.
Escriba un número. @ %Escriba un número mayor al anterior.
  B  C (I)V E 2Ingre un número mayor a 4.
ingrese el valor de x:  G 8 H (II)Ljava/lang/String;  J 8 K (I)Ljava/lang/String;  G N !Digite un número para factorizar P BEl número ingresado no se puede factorizar ya que es igual a cero  J
  S T  print  J 	 7 X tallerfinaljava/TallerFinalJava
 W  [ �
Opción 1: sueldo de empleados 
Opción 2: Números primos en un rango de x a y
Opción 3: Serie de números < x
Opción 4: números factoriales.
Opción 5 para finalizar.  ] Digite una opción
 W _ `  
Ejercicio1
 W b c  
Ejercicio2
 W e f  
Ejercicio3
 W h i  
Ejercicio4 k Programa finalizado. m Opción no valida. o Ingrese otra opción. Code LineNumberTable LocalVariableTable this !Ltallerfinaljava/TallerFinalJava; 	ValorHora D ValorHT ValorHE 	nombreCom Ljava/lang/String; Ljava/util/Scanner; 
salariobas salarioConExt 
srioMaximo 
srioMinimo srioProm numHT I numHE edad n i StackMapTable � java/lang/String divisor p x y j 	operacion suma fac main ([Ljava/lang/String;)V args [Ljava/lang/String; opcion p1 fin Z � MethodParameters 
SourceFile TallerFinalJava.java BootstrapMethods �
 � � � 8 � $java/lang/invoke/StringConcatFactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; � 8Su salario según horas trabajadas mas horas extras es  � Salario mínimo:  � Salario máximo:  � Salario promedio:  � termino : � la suma de los terminos : � +se necesitaron términos para no superar  � Factorial de  es:  �  *  � 1 =  InnerClasses � %java/lang/invoke/MethodHandles$Lookup � java/lang/invoke/MethodHandles Lookup ! W           p   /     *� �    q        r        s t    `   p  �    � Y� 	� L I99996666� � +�  66� �� $� +� &:� *� +�  6� ,� +�  6� .� +�  6( 0o 2o9�k9 4kc9
�
kc9� � 6  � �� 9�� 9c9���i�o9� � :  � � � ;  � � � <  � �    q   z    	     '  /  5  ?  G  M  U  [ # c $ i & q ' w ) � * � + � , � - � / � 0 � 2 � 3 � 6 �  � 8 � : � ; � < = r   �  � P u v  � H w v  � = x v 
 M � y z    s t    �  {   � | v   � } v   � ~ v   �  v   � � v   � � �  ! � � �  $ � � �  ' � � �  8 � � �  �   Z � 8  W         � �  W  �  �   W           c   p  5     j� Y� 	� L=>6� =� +�  =� ?� +�  >6� 766l� p� ������ � � A���ɱ    q   F    ?  @  A  B  C ' D , G 5 H 8 I ; J D K L L O N U Q [ R c G i U r   H  8 + � �  / : � �    j s t    _  {   ] � �   [ � �   X � �  �    � /  W   � � �   f   p  %     v� Y� 	� L=>6� D� +�  >� 7`h`hh6`� � `6� � F  � ���ɲ � I  � � d� L  � �    q   :    W  X  Y  Z  \ % ] 2 ^ ; _ > a E c S d Y f f g u h r   >  2 ' � �    v s t    k  {   i � �   g � �   d � �  �    �   W   � �   i   p  %     f� Y� 	� L>9� M� +�  >� � O� � <� � Q  � R=� �k9� � U  � R����� � V  � �    q   :    j  k  l  n  o  q ! r , t 8 w ? x F y R w X { e } r   4  : + � �    f s t    [  {   Y � �   V � v  �   3 � ,  W    �   W   �   W     	 � �  p  a     �<� WY� YM� Y� 	� N� Z� 6� r� \� -�  <�      N         $   +   2   9   @,� ^���,� a���,� d���,� g���6� j� ���� l� � n� ����    q   ^    �  � 
 �  �  �   � & � . � 3 � X � \ � _ � c � f � j � m � q � t � w �  � � � � � � � r   4    � � �    � � �  
 � � t   �  {    v � �  �    �    � W   7 �    �    �    � �   > 
 �  � �  � �  � �  � �  � �  � �  � �  � �  � �  � �   
  � � � 