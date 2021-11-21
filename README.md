# Dungeons and Dragons Command Line Dice Roller
This is a free-to-use Java command-line program that rolls dice for the RPG, "Dungeons and Dragons." It works with all versions of the game, including 5e.
## Installation
This is a command line program, so to install it, copy the "Main.java" file and place it wherever you like on your computer. Then, run the following command on your command line to make sure it is compiled properly before use:

```bash
javac (file path here)\Main.java
```
## Usage
### Rolling one die with no modifier
Sample input:
```bash
C:\Users\gomal>java C:\Users\gomal\IdeaProjects\DND_DiceRoll\src\com\gommeh\dnd\Main.java roll 1d20
```
Sample output: 
```bash
Rolling...
Your rolls:
9
```
### Rolling one die with a modifier
Sample input:
```bash
C:\Users\gomal>java C:\Users\gomal\IdeaProjects\DND_DiceRoll\src\com\gommeh\dnd\Main.java roll 1d20 -1
```
Sample output: 
```bash
Rolling...
Your rolls:
8
```

### Rolling more than one die with no modifier
Sample input:
```bash
C:\Users\gomal>java C:\Users\gomal\IdeaProjects\DND_DiceRoll\src\com\gommeh\dnd\Main.java roll 3d4
```
Sample output:
```bash
Rolling...
Your rolls:
1 1 3
```

### Rolling more than one die with a modifier
Sample input:
```bash
C:\Users\gomal>java C:\Users\gomal\IdeaProjects\DND_DiceRoll\src\com\gommeh\dnd\Main.java roll 3d4 +2
```
Sample output:
```bash
Rolling...
Your rolls:
3 3 5
```
## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.
## License
See the "LICENSE" file in this repository for more information.
## Support
To ask questions or to get support, email me at gomalley411@gmail.com.
