# Wundertüten (Surprise Bags) - BWINF 2023 Round 1

This project contains a solution for the "Wundertüten" (Surprise Bags) problem from the BWINF42 2023 programming competition.

## Project Structure

- `src/` — Java source files
- `bin/` — Compiled classes
- `Eingabe_Ausgabe.txt` — Input and output file for the program

## How It Works

The program reads the number of surprise bags and the number of different game types from `Eingabe_Ausgabe.txt`. It then distributes the games as evenly as possible among the bags and writes the result back to the same file.

### Example Input (`Eingabe_Ausgabe.txt`)

```
3
3
4
4
4
```

- 3 bags
- 3 types of games
- 4 games of each type

### Output

The program writes the distribution of games to the file, showing which games are in each bag.

## How to Run

1. Make sure you have Java installed.
2. Place your input in `Eingabe_Ausgabe.txt`.
3. Compile the Java files in the `src` folder:
   ```sh
   javac -d bin src/*.java
   ```
4. Run the main class:
   ```sh
   java -cp bin Wundertüten
   ```

## Files

- `src/Wundertüten.java`: Main class, program entry point
- `src/WundertütenPacker.java`: Logic for distributing games
- `src/Wundertüte.java`: Represents a single bag
- `src/FileReaderx.java`: Reads input from file
- `src/FileCreator.java`: Writes output to file

## License

See [LICENSE](LICENSE) for details.