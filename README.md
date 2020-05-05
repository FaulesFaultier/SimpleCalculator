# SimpleCalculator (Java)
Simple Calculator for training (Java)
Der Rechner verfügt über die 4 Grundrechenarten, jeweils für Integer und Floats.
Getestet wurden Positivfälle und Negativfälle mit Exceptions. An Exception wurde das Teilen durch 0 und Integer Overflows beachtet.
Bei Floats wurde die Overflow Behandlung auskommentiert, da diese leider aufgrund der IEE-754 Speicherweise nicht so einfach umzusetzen war.
Die Integerüberlaufbehandlung funktioniert nur solange das Ergebnis kleiner als der Maximalwert des Long-Typs ist ( 9.223.372.036.854.775.807).
