package org.example.JPA.Exercice_01;

import javax.persistence.*;
import java.util.List;

public class Crud {
    private static EntityManager em;

    public static void lancer(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa_demo");
        em = emf.createEntityManager();

//        em.getTransaction().begin();
//        Adresse adr = new Adresse.AdresseBuilder().numero(35).rue("Lalau").ville("Marquette-Lez-Lille").cp(59520).build();
//        Etudiant stud = new Etudiant.EtudiantBuilder().nom("DUTILLEEUX").prenom("Hugo").classe(12).adresse(adr).build();
//        Examen exam1 = new Examen.ExamenBuilder().note(10).matiere("Musique").etudiant(stud).build();
//        Examen exam2 = new Examen.ExamenBuilder().note(10).matiere("Français").etudiant(stud).build();
//        em.persist(stud);
//        em.persist(exam1);
//        em.persist(exam2);
//        em.getTransaction().commit();

//        em.getTransaction().begin();
//        Cours cours = new Cours.CoursBuilder().matière("Dev").professeur("Leo Lhomme").salle("Nouveau siècle").horaire("9-17").build();
//        Etudiant etu = getRef(1);
//        etu.addCours(cours);
//        em.persist(etu);
//        em.getTransaction().commit();

        for(Cours c : getRef(1).getCourss()){
            System.out.println(c);
        }

        int totalNotes = 0;
        int nbNotes = 0;
        for(Examen e : getRef(1).getExamens()){
            if(e.getMatiere().equals("Musique")){
                System.out.println(e);
            }
            totalNotes += e.getNote();
            nbNotes++;
        }
        System.out.printf("Moyenne : %f%n", (float)totalNotes/nbNotes);

        for(Cours c : em.createQuery("select c from Cours c", Cours.class).getResultList()){
            if(c.getProfesseur().equals("Leo Lhomme")){
                System.out.println(c);
            }
        }

    }

    public static void create(Etudiant etu) {
        em.getTransaction().begin();
        em.persist(etu);
        em.getTransaction().commit();
    }

    public static void read(){
        TypedQuery<Etudiant> query = em.createQuery("select p from Etudiant p",Etudiant.class);
        List<Etudiant> etudiants = query.getResultList();

        for (Etudiant etu : etudiants){
            System.out.println(etu);
        }
    }

    public static void update(int id, String nom, String prenom, int classe){
        Etudiant etu = getRef(id);
        em.getTransaction().begin();
        etu.setNom(nom);
        etu.setPrenom(prenom);
        etu.setClasse(classe);
        em.persist(etu);
        em.getTransaction().commit();
    }

    public static void delete(int id){
        Etudiant etu = getRef(id);
        em.getTransaction().begin();
        em.remove(etu);
        em.getTransaction().commit();
    }

    public static Etudiant getRef(int id){
        return em.getReference(Etudiant.class, id);
    }
}
