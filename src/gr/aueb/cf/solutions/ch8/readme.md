**Simple Bank**

Γράψτε μία μέθοδο void withdraw(double amount) η οποία κάνει ανάληψη ενός ποσό amount, μειώνοντας το balance
αντίστοιχα. 

Η withdraw(double amount) ελέγχει αν το amount είναι μικρότερο από το 0 ή μεγαλύτερο από το balance, οπότε
τότε δημιουργεί ένα exception IllegalArgumentException. Το Exception αυτό η withdraw() το κάνει try / catch, στο
catch κάνει System.err.println("Error: " + e.getMessage()); και μετά rethrow

Αλλάξτε επίσης τη main() ώστε να κάνει και αυτή με τη σειρά της try / catch το αντίστοιχο IllegalArgumentException
και να ενημερώνει κατάλληλα τον χρήστη.


