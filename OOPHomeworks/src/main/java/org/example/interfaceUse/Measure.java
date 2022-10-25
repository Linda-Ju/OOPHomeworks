package org.example.interfaceUse;

public class Measure {

    public static void main(String[] args) {
        Measurable[] countries= new Measurable[4];
        countries[0] = new Country ("China", 9706961);
        countries[1] = new Country ("Spain", 505990);
        countries[2] = new Country ("Finland", 338440);
        countries[3] = new Country ("Italy", 301230);
        System.out.println(maximum(countries));
    }

    public static Measurable maximum(Measurable[] countries) {

        if (countries == null || countries.length == 0){
            return new Country("", 0);
        }

        Measurable max = new Country("", 0);
        for (Measurable cntr : countries){
            if(cntr.getMeasurable() > max.getMeasurable()){
                max = cntr;
            }
        }
        return max;
    }
}
