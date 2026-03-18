package com.example.quiz

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class QuizDbHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object {
        private const val DATABASE_NAME = "QuizDB.db"
        private const val DATABASE_VERSION = 1

        const val TABLE_NAME = "questions"
        const val COLUMN_ID = "_id"
        const val COLUMN_QUESTION = "question"
        const val COLUMN_OPTION1 = "option1"
        const val COLUMN_OPTION2 = "option2"
        const val COLUMN_OPTION3 = "option3"
        const val COLUMN_ANSWER = "answer"
        const val COLUMN_CATEGORY = "category"
    }

    override fun onCreate(db: SQLiteDatabase) {
        val createTable = """
            CREATE TABLE $TABLE_NAME (
                $COLUMN_ID INTEGER PRIMARY KEY AUTOINCREMENT,
                $COLUMN_QUESTION TEXT,
                $COLUMN_OPTION1 TEXT,
                $COLUMN_OPTION2 TEXT,
                $COLUMN_OPTION3 TEXT,
                $COLUMN_ANSWER TEXT,
                $COLUMN_CATEGORY TEXT
            )
        """.trimIndent()
        db.execSQL(createTable)

        // ============================
        // Science (40 questions)
        // ============================
        insertQuestion(db, "What planet is known as the Red Planet?", "Earth", "Mars", "Venus", "Mars", "Science")
        insertQuestion(db, "What gas do plants absorb from the atmosphere?", "Oxygen", "Carbon Dioxide", "Nitrogen", "Carbon Dioxide", "Science")
        insertQuestion(db, "What is H2O commonly known as?", "Salt", "Water", "Oxygen", "Water", "Science")
        insertQuestion(db, "Which particle has a negative charge?", "Proton", "Electron", "Neutron", "Electron", "Science")
        insertQuestion(db, "What force keeps us on the ground?", "Gravity", "Magnetism", "Friction", "Gravity", "Science")
        insertQuestion(db, "Which planet is closest to the Sun?", "Mercury", "Venus", "Mars", "Mercury", "Science")
        insertQuestion(db, "What is the center of an atom called?", "Electron", "Proton", "Nucleus", "Nucleus", "Science")
        insertQuestion(db, "What is the chemical symbol for gold?", "Ag", "Au", "Gd", "Au", "Science")
        insertQuestion(db, "Which gas do humans breathe in to survive?", "Oxygen", "Carbon Dioxide", "Nitrogen", "Oxygen", "Science")
        insertQuestion(db, "What organ pumps blood in the human body?", "Lungs", "Heart", "Kidneys", "Heart", "Science")
        insertQuestion(db, "What type of blood cells help fight infections?", "Red blood cells", "White blood cells", "Platelets", "White blood cells", "Science")
        insertQuestion(db, "Which is the largest organ in the human body?", "Liver", "Skin", "Heart", "Skin", "Science")
        insertQuestion(db, "What is the main gas in Earth's atmosphere?", "Oxygen", "Nitrogen", "Carbon Dioxide", "Nitrogen", "Science")
        insertQuestion(db, "Which planet has a ring system?", "Saturn", "Mars", "Venus", "Saturn", "Science")
        insertQuestion(db, "Water freezes at 0 degrees on which scale?", "Celsius", "Fahrenheit", "Kelvin", "Celsius", "Science")
        insertQuestion(db, "What is the process of plants making food called?", "Respiration", "Photosynthesis", "Digestion", "Photosynthesis", "Science")
        insertQuestion(db, "Which organelle is the powerhouse of the cell?", "Nucleus", "Mitochondria", "Ribosome", "Mitochondria", "Science")
        insertQuestion(db, "What planet is known for its Great Red Spot?", "Mars", "Jupiter", "Saturn", "Jupiter", "Science")
        insertQuestion(db, "Which vitamin is produced when sunlight hits our skin?", "Vitamin A", "Vitamin D", "Vitamin C", "Vitamin D", "Science")
        insertQuestion(db, "The chemical symbol 'O' stands for?", "Oxygen", "Gold", "Osmium", "Oxygen", "Science")
        insertQuestion(db, "Which is the heaviest naturally occurring element?", "Uranium", "Lead", "Mercury", "Uranium", "Science")
        insertQuestion(db, "What is the boiling point of water in Celsius?", "100", "212", "90", "100", "Science")
        insertQuestion(db, "What type of celestial body is the Sun?", "Star", "Planet", "Asteroid", "Star", "Science")
        insertQuestion(db, "Which planet is known as the Earth's twin?", "Venus", "Mars", "Mercury", "Venus", "Science")
        insertQuestion(db, "Which gas is essential for combustion?", "Oxygen", "Nitrogen", "Carbon Dioxide", "Oxygen", "Science")
        insertQuestion(db, "Which unit measures electric current?", "Volt", "Ampere", "Ohm", "Ampere", "Science")
        insertQuestion(db, "What force resists motion between two surfaces?", "Gravity", "Friction", "Magnetism", "Friction", "Science")
        insertQuestion(db, "Which is the smallest unit of life?", "Cell", "Atom", "Molecule", "Cell", "Science")
        insertQuestion(db, "Which planet is known for its blue color?", "Earth", "Neptune", "Mars", "Neptune", "Science")
        insertQuestion(db, "What is the most abundant element in the universe?", "Oxygen", "Hydrogen", "Carbon", "Hydrogen", "Science")
        insertQuestion(db, "What type of energy is stored in food?", "Kinetic", "Chemical", "Thermal", "Chemical", "Science")
        insertQuestion(db, "Which planet has the fastest orbit around the Sun?", "Mercury", "Earth", "Venus", "Mercury", "Science")
        insertQuestion(db, "Which is the hardest natural substance on Earth?", "Diamond", "Gold", "Iron", "Diamond", "Science")
        insertQuestion(db, "Which organ helps in digestion by producing bile?", "Liver", "Stomach", "Pancreas", "Liver", "Science")
        insertQuestion(db, "What is the process of liquid turning to gas called?", "Condensation", "Evaporation", "Precipitation", "Evaporation", "Science")
        insertQuestion(db, "Which particle has no electric charge?", "Electron", "Neutron", "Proton", "Neutron", "Science")
        insertQuestion(db, "What planet is famous for its giant storm 'The Great Red Spot'?", "Jupiter", "Mars", "Saturn", "Jupiter", "Science")
        insertQuestion(db, "Which organ purifies blood in the human body?", "Kidneys", "Liver", "Lungs", "Kidneys", "Science")
        insertQuestion(db, "Which is the lightest element in the periodic table?", "Hydrogen", "Helium", "Oxygen", "Hydrogen", "Science")
        insertQuestion(db, "What type of celestial body is the Moon?", "Planet", "Satellite", "Star", "Satellite", "Science")
        insertQuestion(db, "Which gas causes greenhouse effect?", "Oxygen", "Carbon Dioxide", "Nitrogen", "Carbon Dioxide", "Science")

        // ============================
        // Computer Science (40 questions)
        // ============================
        insertQuestion(db, "What does CPU stand for?", "Central Process Unit", "Central Processing Unit", "Computer Processing Unit", "Central Processing Unit", "Computer Science")
        insertQuestion(db, "Which language is used for Android development?", "Java", "C#", "Python", "Java", "Computer Science")
        insertQuestion(db, "What does HTML stand for?", "Hyper Text Markup Language", "Home Tool Markup Language", "Hyperlinks and Text Markup Language", "Hyper Text Markup Language", "Computer Science")
        insertQuestion(db, "Which tag is used for a hyperlink in HTML?", "<a>", "<link>", "<href>", "<a>", "Computer Science")
        insertQuestion(db, "Which language is used for styling web pages?", "HTML", "CSS", "JavaScript", "CSS", "Computer Science")
        insertQuestion(db, "Which language is used for backend web development?", "Python", "CSS", "HTML", "Python", "Computer Science")
        insertQuestion(db, "Which HTML element defines the title of a document?", "<title>", "<head>", "<meta>", "<title>", "Computer Science")
        insertQuestion(db, "Which operator is used for assignment in Java?", "=", "==", "===", "=", "Computer Science")
        insertQuestion(db, "Which JavaScript function writes to the web page?", "document.write()", "console.log()", "print()", "document.write()", "Computer Science")
        insertQuestion(db, "Which symbol is used for single-line comment in JavaScript?", "//", "#", "/*", "//", "Computer Science")
        insertQuestion(db, "What does SQL stand for?", "Structured Query Language", "Simple Query Language", "Sequential Query Language", "Structured Query Language", "Computer Science")
        insertQuestion(db, "Which is used to create responsive websites?", "CSS", "Bootstrap", "Java", "Bootstrap", "Computer Science")
        insertQuestion(db, "Which method converts a string to lowercase in JavaScript?", "toLower()", "toLowerCase()", "stringLower()", "toLowerCase()", "Computer Science")
        insertQuestion(db, "Which tag is used to define a table row in HTML?", "<tr>", "<td>", "<table>", "<tr>", "Computer Science")
        insertQuestion(db, "Which HTML element is used to play video?", "<video>", "<media>", "<movie>", "<video>", "Computer Science")
        insertQuestion(db, "Which CSS property is used to change font size?", "font-size", "text-size", "font-style", "font-size", "Computer Science")
        insertQuestion(db, "Which HTML tag is used for a line break?", "<br>", "<break>", "<lb>", "<br>", "Computer Science")
        insertQuestion(db, "Which JavaScript keyword declares a variable?", "var", "let", "dim", "var", "Computer Science")
        insertQuestion(db, "Which operator checks equality and type in JavaScript?", "==", "===", "!=", "===", "Computer Science")
        insertQuestion(db, "Which CSS property is used to center text?", "text-align", "align-text", "center", "text-align", "Computer Science")
        insertQuestion(db, "Which method finds length of a string in JS?", "length()", "getLength()", "string.length()", "string.length()", "Computer Science")
        insertQuestion(db, "Which HTML element defines an unordered list?", "<ul>", "<ol>", "<li>", "<ul>", "Computer Science")
        insertQuestion(db, "Which event occurs when the user clicks an element?", "onclick", "onchange", "onmouseover", "onclick", "Computer Science")
        insertQuestion(db, "Which tag defines an internal style sheet?", "<style>", "<css>", "<script>", "<style>", "Computer Science")
        insertQuestion(db, "Which tag is used to define a division in HTML?", "<div>", "<span>", "<section>", "<div>", "Computer Science")
        insertQuestion(db, "Which is correct CSS syntax?", "body {color: black;}", "{body:color=black;}", "body:color=black;", "body {color: black;}", "Computer Science")
        insertQuestion(db, "Which HTML element is for emphasized text?", "<em>", "<i>", "<strong>", "<em>", "Computer Science")
        insertQuestion(db, "Which property makes text bold in CSS?", "font-weight", "font-style", "text-style", "font-weight", "Computer Science")
        insertQuestion(db, "How do you declare an array in JS?", "var list = ['a','b']", "var list = (1:'a',2:'b')", "array = a,b", "var list = ['a','b']", "Computer Science")
        insertQuestion(db, "Which HTML tag is used for a checkbox?", "<input type='checkbox'>", "<check>", "<input type='check'>", "<input type='checkbox'>", "Computer Science")
        insertQuestion(db, "Which CSS property changes font family?", "font-family", "font", "typeface", "font-family", "Computer Science")
        insertQuestion(db, "Which JavaScript statement is correct IF?", "if (i==5)", "if i==5 then", "if i=5", "if (i==5)", "Computer Science")
        insertQuestion(db, "Which tag defines a navigation section in HTML?", "<nav>", "<menu>", "<navigate>", "<nav>", "Computer Science")
        insertQuestion(db, "Which symbol comments single line in JS?", "//", "/*", "#", "//", "Computer Science")
        insertQuestion(db, "Which HTML tag defines the largest heading?", "<h1>", "<h6>", "<head>", "<h1>", "Computer Science")
        insertQuestion(db, "Which method converts string to lowercase?", "toLowerCase()", "toLower()", "stringLower()", "toLowerCase()", "Computer Science")
        insertQuestion(db, "Which HTML attribute defines inline style?", "style", "class", "css", "style", "Computer Science")
        insertQuestion(db, "Which HTML element defines a numbered list?", "<ol>", "<ul>", "<list>", "<ol>", "Computer Science")
        insertQuestion(db, "Which operator assigns a value to a variable?", "=", "*", "-", "=", "Computer Science")
        insertQuestion(db, "Which tag defines a table header cell?", "<th>", "<td>", "<tr>", "<th>", "Computer Science")
        insertQuestion(db, "Which attribute provides alternate text for image?", "alt", "src", "title", "alt", "Computer Science")

        // ============================
        // Remaining categories (Mathematics, Geography, Sports, Art, History, Food & Drink, Movies & TV Shows, Flags)
        // ============================
        // You can continue inserting all remaining questions in the same pattern
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS $TABLE_NAME")
        onCreate(db)
    }

    private fun insertQuestion(
        db: SQLiteDatabase,
        question: String,
        option1: String,
        option2: String,
        option3: String,
        answer: String,
        category: String
    ) {
        val values = ContentValues().apply {
            put(COLUMN_QUESTION, question)
            put(COLUMN_OPTION1, option1)
            put(COLUMN_OPTION2, option2)
            put(COLUMN_OPTION3, option3)
            put(COLUMN_ANSWER, answer)
            put(COLUMN_CATEGORY, category)
        }
        db.insert(TABLE_NAME, null, values)
    }

    fun getRandomQuestionByCategory(category: String): Cursor {
        val db = readableDatabase
        return db.rawQuery(
            "SELECT * FROM $TABLE_NAME WHERE $COLUMN_CATEGORY=? ORDER BY RANDOM() LIMIT 1",
            arrayOf(category)
        )
    }
}