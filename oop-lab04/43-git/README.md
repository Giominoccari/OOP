# Esercizio con Git, in locale

Per ogni passo,
si annoti in questo file il comando utilizzato ed il suo output,
per confrontarlo con le soluzioni.

### Si crei una nuova directory
mkdir cartella-git

### Si inizializzi un repository Git dentro la cartella suddetta.
git init

### Si osservi lo stato del repository
git status

### Si scriva un file `HelloWorld.java` contenente un `main` con una stampa a video e si osservi il contenuto del repository
touch HelloWorld.java

### Si aggiunga `HelloWorld.java` allo stage, e si osservi lo stato del repository
git add HelloWorld.java

### Si crei il primo commit, con messaggio ragionevole. Se necessario, si configuri nome utente ed email di git usando i dati dell'account istituzionale.
git commit -m "work in progress"

### Si compili il file Java e si verifichi lo stato del repository
javac HelloWorld.java

### Si noti che c'è un file rigenerabile (`HelloWorld.class`). Si costruisca una lista di file ignorati che ignori tutti i file con estensione `.class`
vim .gitignore 
*.class :wq

### Si osservi lo stato del repository
"presenza file.gitignore"

### Si crei un nuovo commit che tracci il la ignore list, aggiungendo allo stage i file necessari. Si osservi sempre lo stato del repository dopo l'esecuzione di un comando
git add .
git commit -m "win"

### Si gestiscano i caratteri di fine linea in modo appropriato, creando un file `.gitattributes`
nano .gitattributes

### Si osservi la storia del repository usando `git log --all --graph`
ok

### Da questo punto in poi, prima e dopo ogni comando, ci si assicuri di osservare lo stato del repository con `git status`
ok

### Si crei un file Mistake.java, con contenuto arbitrario, lo si aggiunga al tracker, e si faccia un commit
touch Mistake.java
open Mistake.java
git add Misteake.java
git commit -m "wo in pr"

### Si rinomini `Mistake.java` in `ToDelete.java`, e si faccia un commit che registra la modifica
mv Mistake.java ToDelete.java 
git add .
git commit -m "ok"

### Si elimini `ToDelete.java` e si registri la modifica in un commit
rm ToDelete.java
git add .
git commit

### Si osservi la storia del repository e si identifichi il commit dove è stato creato `Mistake.java`. Per una visione compatta, si usi l'opzione `--oneline`
git log --all --oneline

### Si ripristini Mistake.java dal commit identificato al passo precedente
git checkout HEAD~2
git switch -c mistake

### Si rimuova il file ripristinato e si ripulisca lo stage
ok

### Si torni al commit precedente a quello in cui `Mistake.java` è stato creato. Si utilizzi la storia del repository se utile.
