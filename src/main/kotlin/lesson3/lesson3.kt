val name String='Hackaton Survival' //Название мероприятия

var date String=9.10.2024 //Дата проведения

val place String=Sochi //Место проведения

private val budget String =  5000"" //Подробный бюджет мероприятия, включая расходы на оборудование, кейтеринг и другие операционные расходы.

var number: Int = 0 //Количество участников
    get() = field
    private set(value) {field=value}

var duration: Long = 8*60*60 //Длительность хакатона

private lateinit var contractinformation: String //Контактная информация и условия соглашений с поставщиками пищи, оборудования и других услуг.

var status: String = "не начат" //Текущее состояние хакатона (статус)

val sponsors: String = "список спонсоров" //Список спонсоров

var internetAccessLevel: Int = 0 //Текущий уровень доступа к интернету

val mood: String by lazy { "" }

private var information: String = "информация о транспортировке"

lateinit var plan: String

var numberofteams: Int = 0 //Количество команд

val tasks: String = "Задачи"

val evacuationplan: String = "План Эвакуации" //План эвакуации

var listofavailableequipment: String " " //Список доступного оборудования

var listoffreeequipment: String = "50" //Список доступного оборудования

val urgentplan: String = "План мероприятий на случай сбоя" //План мероприятий на случай сбоев

val feedback: String by lazy { "" } //анонимные вопросы