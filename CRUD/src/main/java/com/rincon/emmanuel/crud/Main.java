package com.rincon.emmanuel.crud;

//Autor: Rincón García Emmanuel Ricardo
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Alumnos> listaAlumnos = new ArrayList<>();
        int opcion = 0;
        int op = 0;

        String codigo;
        String nombre;
        String apPaterno;
        String apMaterno;
        int edad;
        String licenciatura;
        String materiaUno;
        String materiaDos;
        String materiaTres;
        String materiaCuatro;
        String materiaCinco;

        String horarioUno;
        String horarioDos;
        String horarioTres;
        String horarioCuatro;
        String horarioCinco;

        // Datos a capturar
        while (opcion != 6) {
            System.out.println("\t\tMENU");
            System.out.println("1. Ingresa datos de un alumno");
            System.out.println("2. Mostrar todos los alumnos");
            System.out.println("3. Eliminar alumno");
            System.out.println("4. Modificar alumno");
            System.out.println("5. Buscar alumno");
            System.out.println("6. Salir");

            System.out.println("Ingresa la opción deseada: ");
            opcion = in.nextInt();
            System.out.flush();
            in.nextLine(); // limpiar buffer de entrada
            switch (opcion) {

            case 1:
                Alumnos x = new Alumnos();

                System.out.println("Ingresa el código del alumno: ");
                x.setCodigo(in.nextLine());

                System.out.println("Ingresa nombre del alumno: ");
                x.setNombre(in.nextLine());

                System.out.println("Ingresa el apellido paterno: ");
                x.setApellidoPaterno(in.nextLine());

                System.out.println("Ingresa el apellido materno: ");
                x.setApellidoMaterno(in.nextLine());

                System.out.println("Ingresa la edad ");
                x.setEdad(in.nextInt());

                in.nextLine();

                System.out.println("Ingresa la licenciatura: ");
                x.setLicenciatura(in.nextLine());

                System.out.println("\n\nIngresa la primer materia: ");
                x.setMateriaUno(in.nextLine());

                System.out.println("Ingresa el primer horario: ");
                x.setHorarioUno(in.nextLine());

                System.out.println("Ingresa la segunda materia: ");
                x.setMateriaDos(in.nextLine());

                System.out.println("Ingresa el segundo horario: ");
                x.setHorarioDos(in.nextLine());

                System.out.println("Ingresa la tercer materia: ");
                x.setMateriaTres(in.nextLine());

                System.out.println("Ingresa el tercer horario: ");
                x.setHorarioTres(in.nextLine());

                System.out.println("Ingresa la cuarta materia: ");
                x.setMateriaCuatro(in.nextLine());

                System.out.println("Ingresa el cuarto horario: ");
                x.setHorarioCuatro(in.nextLine());

                System.out.println("Ingresa la quinta materia: ");
                x.setMateriaCinco(in.nextLine());

                System.out.println("Ingresa el quinto horario: ");
                x.setHorarioCinco(in.nextLine());

                listaAlumnos.add(x);

                System.out.println("Los datos del alumno con código " + x.getCodigo() + " han sido guardado con exito");
                break;

            case 2:

                for (int i = 0; i < listaAlumnos.size(); i++) {
                    Alumnos alumno = listaAlumnos.get(i);
                    System.out.flush();
                    System.out.println("\t\tALUMNOS");
                    System.out.println("Codigo: " + alumno.getCodigo());
                    System.out.println("Nombre: " + alumno.getNombre());
                    System.out.println("Apellido Paterno: " + alumno.getApellidoPaterno());
                    System.out.println("Apellido Materno: " + alumno.getApellidoMaterno());
                    System.out.println("Edad: " + alumno.getEdad());
                    System.out.println("Licenciatura: " + alumno.getLicenciatura());

                    System.out.println("Materia: " + alumno.getMateriaUno());
                    System.out.println("Horario: " + alumno.getHorarioUno() + "\n\n");

                    System.out.println("Materia: " + alumno.getMateriaDos());
                    System.out.println("Horario: " + alumno.getHorarioDos() + "\n\n");

                    System.out.println("Materia: " + alumno.getMateriaTres());
                    System.out.println("Horario: " + alumno.getHorarioTres() + "\n\n");

                    System.out.println("Materia: " + alumno.getMateriaCuatro());
                    System.out.println("Horario: " + alumno.getHorarioCuatro() + "\n\n");

                    System.out.println("Materia: " + alumno.getMateriaCinco());
                    System.out.println("Horario: " + alumno.getHorarioCinco() + "\n\n");
                }

                break;

            case 3:
                System.out.flush();
                System.out.println("\t\tELIMINAR ALUMNO");

                System.out.println("Ingresa el codigo del alumno que deseas eliminar: ");
                codigo = in.nextLine();

                for (int i = 0; i < listaAlumnos.size(); i++) {
                    Alumnos alumno = listaAlumnos.get(i);
                    if (codigo.equals(alumno.getCodigo())) {

                        System.out.println("Nombre: " + alumno.getNombre());
                        System.out.println("Apellido Paterno: " + alumno.getApellidoPaterno());
                        System.out.println("Apellido Materno: " + alumno.getApellidoMaterno());

                        System.out.println("¿Estas seguro de eliminar al alumno definitivamente?");
                        System.out.println("1. Si");
                        System.out.println("2. No");
                        System.out.println("Ingresa el numero de la opción: ");
                        op = in.nextInt();
                        if (op == 1) {
                            listaAlumnos.remove(i);
                            System.out.println("El alumno ha sido eliminado con exito");
                        } else {
                            System.out.println("El alumno NO ha sido eliminado");
                        }
                    } else {
                        System.out.println("El alumno no ha sido encontrado...");
                    }
                }
                break;

            case 4:
                System.out.flush();
                System.out.println("\t\tMODIFICAR DATOS");
                System.out.println("Ingresa el codigo del alumno a modificar");
                codigo = in.nextLine();

                for (int i = 0; i < listaAlumnos.size(); i++) {
                    Alumnos alumno = listaAlumnos.get(i);

                    if (codigo.equals(alumno.getCodigo())) {
                        System.out.println("Nombre: " + alumno.getNombre());
                        System.out.println("Apellido Paterno: " + alumno.getApellidoPaterno());
                        System.out.println("Apellido Materno: " + alumno.getApellidoMaterno());
                        System.out.println("Edad: " + alumno.getEdad());
                        System.out.println("Licenciatura: " + alumno.getLicenciatura());

                        System.out.println("Primer Materia: " + alumno.getMateriaUno());
                        System.out.println("Primer Horario: " + alumno.getHorarioUno() + "\n\n");

                        System.out.println("Segunda Materia: " + alumno.getMateriaDos());
                        System.out.println("Segundo Horario: " + alumno.getHorarioDos() + "\n\n");

                        System.out.println("Tercer Materia: " + alumno.getMateriaTres());
                        System.out.println("Tercer Horario: " + alumno.getHorarioTres() + "\n\n");

                        System.out.println("Cuarta Materia: " + alumno.getMateriaCuatro());
                        System.out.println("Cuarto Horario: " + alumno.getHorarioCuatro() + "\n\n");

                        System.out.println("Quinta Materia: " + alumno.getMateriaCinco());
                        System.out.println("Quinto Horario: " + alumno.getHorarioCinco() + "\n\n");

                        System.out.println("¿Que dato desea modificar?");
                        System.out.println("1. Nombre");
                        System.out.println("2. Apellido Paterno");
                        System.out.println("3. Apellido Materno");
                        System.out.println("4. Edad");
                        System.out.println("5. Licenciatura");

                        System.out.println("6. Primer Materia");
                        System.out.println("7. Primer Horario");

                        System.out.println("8. Segunda Materia");
                        System.out.println("9. Segundo Horario");

                        System.out.println("10. Tercer Materia");
                        System.out.println("11. Tercer Horario");

                        System.out.println("12. Cuarta Materia");
                        System.out.println("13. Cuarto Horario");

                        System.out.println("14. Quinta Materia");
                        System.out.println("15. Quinto Horario");

                        System.out.println("Ingresa el numero de la opción: ");

                        op = in.nextInt();
                        in.nextLine();
                        if (op == 1) {
                            System.out.println("Ingresa el nombre correcto: ");
                            nombre = in.nextLine();
                            alumno.setNombre(nombre);
                            System.out.println("Los datos del alumno se guardaron con éxito!");
                        }
                        if (op == 2) {
                            System.out.println("Ingresa el apellido paterno correcto: ");
                            apPaterno = in.nextLine();
                            alumno.setApellidoPaterno(apPaterno);
                            System.out.println("Los datos del alumno se guardaron con éxito!");
                        }
                        if (op == 3) {
                            System.out.println("Ingresa el apellido materno correcto: ");
                            apMaterno = in.nextLine();
                            alumno.setApellidoMaterno(apMaterno);
                            System.out.println("Los datos del alumno se guardaron con éxito!");
                        }
                        if (op == 4) {
                            System.out.println("Ingresa la edad correcta: ");
                            edad = in.nextInt();
                            alumno.setEdad(edad);
                            System.out.println("Los datos del alumno se guardaron con éxito!");
                        }
                        if (op == 5) {
                            System.out.println("Ingresa la licenciatura correcta ");
                            licenciatura = in.nextLine();
                            alumno.setLicenciatura(licenciatura);
                            System.out.println("Los datos del alumno se guardaron con éxito!");
                        }

                        // Primer materia
                        if (op == 6) {
                            System.out.println("Ingresa la materia correcta: ");
                            materiaUno = in.nextLine();
                            alumno.setMateriaUno(materiaUno);
                            System.out.println("Los datos del alumno se guardaron con éxito!");
                        }

                        // Primer horario
                        if (op == 7) {
                            System.out.println("Ingresa el horario correcto: ");
                            horarioUno = in.nextLine();
                            alumno.setHorarioUno(horarioUno);
                            System.out.println("Los datos del alumno se guardaron con éxito!");
                        }

                        // Segunda materia
                        if (op == 8) {
                            System.out.println("Ingresa la materia correcta: ");
                            materiaDos = in.nextLine();
                            alumno.setMateriaDos(materiaDos);
                            System.out.println("Los datos del alumno se guardaron con éxito!");
                        }
                        // Segundo horario
                        if (op == 9) {
                            System.out.println("Ingresa el horario correcto: ");
                            horarioDos = in.nextLine();
                            alumno.setHorarioDos(horarioDos);
                            System.out.println("Los datos del alumno se guardaron con éxito!");
                        }

                        // Tercer materia
                        if (op == 10) {
                            System.out.println("Ingresa la materia correcta: ");
                            materiaTres = in.nextLine();
                            alumno.setMateriaTres(materiaTres);
                            System.out.println("Los datos del alumno se guardaron con éxito!");
                        }

                        // Tercer horario
                        if (op == 11) {
                            System.out.println("Ingresa el horario correcto: ");
                            horarioTres = in.nextLine();
                            alumno.setHorarioTres(horarioTres);
                            System.out.println("Los datos del alumno se guardaron con éxito!");
                        }

                        // Cuarta materia
                        if (op == 12) {
                            System.out.println("Ingresa la materia correcta: ");
                            materiaCuatro = in.nextLine();
                            alumno.setMateriaCuatro(materiaCuatro);
                            System.out.println("Los datos del alumno se guardaron con éxito!");
                        }

                        // cuarto horario
                        if (op == 13) {
                            System.out.println("Ingresa el horario correcto: ");
                            horarioCuatro = in.nextLine();
                            alumno.setHorarioCuatro(horarioCuatro);
                            System.out.println("Los datos del alumno se guardaron con éxito!");
                        }
                        // quinta materia
                        if (op == 14) {
                            System.out.println("Ingresa la materia correcta: ");
                            materiaCinco = in.nextLine();
                            alumno.setMateriaCinco(materiaCinco);
                            System.out.println("Los datos del alumno se guardaron con éxito!");
                        }
                        // quinto horario
                        if (op == 15) {
                            System.out.println("Ingresa el horario correcto: ");
                            horarioCinco = in.nextLine();
                            alumno.setHorarioCinco(horarioCinco);
                            System.out.println("Los datos del alumno se guardaron con éxito!");
                        }
                    } else {
                        System.out.println("Alumno inexistente...");
                    }
                }

                break;

            case 5:
                System.out.flush();
                System.out.println("\t\tBUSCAR ALUMNO");
                System.out.println("Ingresa el código del alumno a buscar: ");
                codigo = in.nextLine();

                for (int i = 0; i < listaAlumnos.size(); i++) {
                    Alumnos alumno = listaAlumnos.get(i);

                    if (codigo.equals(alumno.getCodigo())) {
                        System.out.println("Nombre: " + alumno.getNombre());
                        System.out.println("Apellido Paterno: " + alumno.getApellidoPaterno());
                        System.out.println("Apellido Materno: " + alumno.getApellidoMaterno());
                        System.out.println("Edad: " + alumno.getEdad());
                        System.out.println("Licenciatura: " + alumno.getLicenciatura());

                        System.out.println("Primer Materia: " + alumno.getMateriaUno());
                        System.out.println("Primer Horario: " + alumno.getHorarioUno() + "\n\n");

                        System.out.println("Segunda Materia: " + alumno.getMateriaDos());
                        System.out.println("Segundo Horario: " + alumno.getHorarioDos() + "\n\n");

                        System.out.println("Tercer Materia: " + alumno.getMateriaTres());
                        System.out.println("Tercer Horario: " + alumno.getHorarioTres() + "\n\n");

                        System.out.println("Cuarta Materia: " + alumno.getMateriaCuatro());
                        System.out.println("Cuarto Horario: " + alumno.getHorarioCuatro() + "\n\n");

                        System.out.println("Quinta Materia: " + alumno.getMateriaCinco());
                        System.out.println("Quinto Horario: " + alumno.getHorarioCinco() + "\n\n");

                    } else {
                        System.out.println("El código de alumno no existe!");
                    }
                }
                break;

            case 6:
                System.out.println("Hasta pronto");
                break;
            default:
                System.out.println("Esta no es una opción correcta, intenta de nuevo");
                break;
            }

        }

    }
}
