package tareaprograpoo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TareaPrograPOO {
    private JFrame frame;
    private JPanel panel;
    private JButton botonSumar;
    private JButton botonRestar;
    private JButton botonMultiplicar;
    private JButton botonDividir;
    private JButton botonRaizCuadrada;
    private JButton botonEsPrimo;
    private JButton botonSumatoria;
    private JButton botonSeno;
    private JButton botonCadenaInvertida;
    private JButton botonVerificarPar;
    private JButton botonMensajeEspecial;
    private JButton botonFactorial;
    private JTextArea resultadoTextArea;

    private Calculadora calculadora;
    private CalculadoraEspecial calculadoraEspecial;

    public TareaPrograPOO() {
        calculadora = new Calculadora("Steven");
        calculadoraEspecial = new CalculadoraEspecial();

        frame = new JFrame("Tarea PrograPOO");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Dimension dimension = new Dimension(500, 400);
        frame.setPreferredSize(dimension);
        
        panel = new JPanel();
        panel.setLayout(new FlowLayout());

        botonSumar = new JButton("Sumar");
        botonSumar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double resultado = calculadora.sumar(10, 5);
                resultadoTextArea.setText("El resultado de la suma es = " + resultado);
            }
        });
        panel.add(botonSumar);

        botonRestar = new JButton("Restar");
        botonRestar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double resultado = calculadora.restar(10, 5);
                resultadoTextArea.setText("El resultado de la resta es = " + resultado);
            }
        });
        panel.add(botonRestar);

        botonMultiplicar = new JButton("Multiplicar");
        botonMultiplicar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double resultado = calculadora.multiplicar(10, 5);
                resultadoTextArea.setText("El resultado de la multiplicación es = " + resultado);
            }
        });
        panel.add(botonMultiplicar);

        botonDividir = new JButton("Dividir");
        botonDividir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double resultado = calculadora.dividir(10, 5);
                resultadoTextArea.setText("El resultado de la división es = " + resultado);
            }
        });
        panel.add(botonDividir);

        botonRaizCuadrada = new JButton("Raíz Cuadrada");
        botonRaizCuadrada.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double resultado = calculadora.raizCuadrada(16);
                resultadoTextArea.setText("El resultado de la raíz cuadrada es = " + resultado);
            }
        });
        panel.add(botonRaizCuadrada);

        botonEsPrimo = new JButton("Verificar Primo");
        botonEsPrimo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boolean esPrimo = calculadora.esPrimo(11);
                resultadoTextArea.setText("¿Es primo? = " + esPrimo);
            }
        });
        panel.add(botonEsPrimo);

        botonSumatoria = new JButton("Sumatoria Aleatoria");
        botonSumatoria.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int resultado = calculadoraEspecial.sumatoriaDeNumerosAleatorios();
                resultadoTextArea.setText("Resultado del Método 1 de Calculadora Especial = " + resultado);
            }
        });
        panel.add(botonSumatoria);

        botonSeno = new JButton("Seno de Ángulos");
        botonSeno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double resultado = calculadoraEspecial.SenoDeAngulos();
                resultadoTextArea.setText("Resultado del Método 2 de Calculadora Especial = " + resultado);
            }
        });
        panel.add(botonSeno);

        botonCadenaInvertida = new JButton("Cadena Invertida");
        botonCadenaInvertida.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String resultado = calculadoraEspecial.CadenaInvertida();
                resultadoTextArea.setText("Resultado del Método 3 de Calculadora Especial = " + resultado);
            }
        });
        panel.add(botonCadenaInvertida);

        botonVerificarPar = new JButton("Verificar Número Par");
        botonVerificarPar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boolean esPar = calculadoraEspecial.VerificarNumeroPar();
                resultadoTextArea.setText("Resultado del Método 4 de Calculadora Especial = " + esPar);
            }
        });
        panel.add(botonVerificarPar);

        botonFactorial = new JButton("Factorial de un Número");
        botonFactorial.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int resultado = calculadoraEspecial.Factorialdeunnumero();
                resultadoTextArea.setText("Resultado del Método 6 de Calculadora Especial = " + resultado);
            }
        });
        panel.add(botonFactorial);

        resultadoTextArea = new JTextArea();
        resultadoTextArea.setEditable(false);
        panel.add(resultadoTextArea);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TareaPrograPOO();
            }
        });
    }
}

