package converter

import converter.units.length.LengthUnit
import converter.units.length.*
import converter.units.weight.*
import java.lang.Exception

class UnitConverter {

    fun startConvert() {

        while (true) {
            print("Enter what you want to convert (or exit): ")
            var userInput = readLine() as String
            if (userInput == "exit")
                return
            try {
                // x TYPE1 randomword TYPE2
                val size = userInput.split(" ")[0].toDouble() // x
                val type1 = userInput.split(" ")[1] // TYPE1
                val type2 = userInput.split(" ")[3] // TYPE2

                val unitFrom = createLengthUnit(size, type1) ?: createWeightUnit(size, type1)
                val unitTo = createLengthUnit(0.0, type2) ?: createWeightUnit(0.0, type2)

                if (unitFrom is LengthUnit && unitTo is LengthUnit) {
                    var meter = MeterUnit(unitFrom.toMeters)
                    val unitTwo = createLengthUnit(meter.toType(unitTo.type), type2)
                    if(unitFrom::class == unitTwo!!::class){
                        println("${unitFrom.length} ${unitFrom.name} is ${unitFrom.length} ${unitFrom.name}")
                    } else
                        println("${unitFrom.length} ${unitFrom.name} is ${unitTwo?.length} ${unitTwo?.name}")
                } else if (unitFrom is WeightUnit && unitTo is WeightUnit) {
                    var gram = GramUnit(unitFrom.toGrams)
                    val unitTwo = createWeightUnit(gram.toType(unitTo.type), type2)

                    if(unitFrom::class == unitTwo!!::class){
                        println("${unitFrom.weight} ${unitFrom.name} is ${unitFrom.weight} ${unitFrom.name}")
                    } else
                        println("${unitFrom.weight} ${unitFrom.name} is ${unitTwo?.weight} ${unitTwo?.name}")
                } else {
                    println("Conversion from ${unitFrom?.manyUnits ?: "???"} to ${unitTo?.manyUnits ?: "???"} is impossible")
                }
            } catch (e: Exception) {
                continue
            }
        }
    }

    fun createLengthUnit(length: Double, type: String): LengthUnit? {
        return when (type.lowercase()) {
            "m", "meter", "meters" -> MeterUnit(length)
            "km", "kilometer", "kilometers" -> KilometerUnit(length)
            "cm", "centimeter", "centimeters" -> CentimeterUnit(length)
            "mm", "millimeter", "millimeters" -> MillimeterUnit(length)
            "mi", "mile", "miles" -> MileUnit(length)
            "yd", "yard", "yards" -> YardUnit(length)
            "ft", "foot", "feet" -> FootUnit(length)
            "in", "inch", "inches" -> InchUnit(length)
            else -> null
        }
    }

    fun createWeightUnit(weight: Double, type: String): WeightUnit? {
        return when (type.lowercase()) {
            "g", "gram", "grams" -> GramUnit(weight)
            "kg", "kilogram", "kilograms" -> KilogramUnit(weight)
            "mg", "milligram", "milligrams" -> MilligramUnit(weight)
            "lb", "pound", "pounds" -> PoundUnit(weight)
            "oz", "ounce", "ounces" -> OunceUnit(weight)
            else -> null
        }
    }

}

