[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/4mdSnuRi)
# Uzdevuma nosaukums: Studentu reģistrācijas sistēma (Uzdevums 2)

## Uzdevuma mērķis: Izveidot CLI (command line interface) programmu studentu reģistrācijas sistēmu. Programmai jāļauj lietotājam reģistrēt jaunus studentus. Datus jāglabā csv failā.

### Uzdevuma prasības:
Programmai jāļauj lietotājam reģistrēt jaunus studentus, ievadot šādu informāciju:
- Vārds
- Uzvārds
- E-pasts
- Grupa

Datus jāglabā csv failā.
Katrai programmas funkcionalitātei jāatrodas savā klassē, katra klassei ir sava loma un mērķis.

### Uzdevuma izpildes soļi:
Katrai funkcionalitātei izveidojiet savu klasi. Piemēram Student, Validator, CsvManager, Registration. Klases daudzums un to saturs varbūt diezgan stipri atkarīgs no paša programmētāja, tāpēc varat būt radoši šajā processā.
Jābūt iespējai izvēlēties darbību: register, show, remove, exit.

### Uzdevuma papildu prasības:
Programmai jāļauj lietotājam atlasīt (sort by) studentus pēc noteiktiem kritērijiem, vārds, uzvārds u.t.t.
Izveidojiet izņēmumus (kļūdu paziņojumus), kad lietotājs ievada nepareizu informāciju.



## Ka lietot?

Piemers:
1. Registration - 
     - Run file
     - Enter command(register | show | remove | update | exit): 
     - Izvelies comandu
     - register (
            Piemers :
             - Dan (vards)
             - Onufrijuks (uzvards)
             - do00@ (email)
             - DP 2-3 (grupa)
        )
     - show (
            Piemers :
                Izvade:
                    Registretie studenti

                    Dan, Onufrijuks, do00@, DP 2-3
        )
     - remove (
            Piemers:
                Izvade:
                    Dan, Onufrijuks, do00@, DP 2-3
                    Enter line to remove:
                     - Dan, Onufrijuks, do00@, DP 2-3
                    "String " + lineToRemove + " deleted from file " + fileName"
        )
     - update (
            Piemers:
                Izvade:
                    Dan, Onufrijuks, do00@, DP 2-3
                    Enter line which you want to update
                     - Dan, Onufrijuks, do00@, DP 2-3
                    Enter updated line
                     - Dan, Onufrijuks, do00@, DP 2-2
        )
     - exit (
            Piemers:
                Izvade:
                    Izejam no programmas
                    "programmas aizveras"
        )
