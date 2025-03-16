package com.example.androidpractice

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

//запускать приложение не надо.
// надо открыть тут в правом верхнем углу вкладку предпросмотра

//NO CHATGPT

//16.03.2025 - Тима, ты - молодець!!! 🎉🎉🎉

@Composable
fun Task1() {
    // ✅ Сделай 3 текста которые располагаются сверху вниз.
    Column {
        Text("bombaleyla")
        Text("bombaleyla")
        Text("bombaleyla")
    }
}

@Composable
fun Task2() {
    // ✅ Сделай картинку, текст и кнопку которые располагаются посередине экрана
    Column(
        Modifier
            .fillMaxSize(), Arrangement.Center, Alignment.CenterHorizontally
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_launcher_foreground),
            contentDescription = "androed",
            modifier = Modifier
                .size(50.dp)
        )
        Button(
            onClick = {},
            modifier = Modifier
                .width(150.dp)
                .height(60.dp)
        ) {
            Text(text = "hello")
        }
        Text(text = "qwerty")
    }
}

@Composable
fun Task3() {
    // ✅ Сделай Колумн, в котором еще один колумн который 80х80, красного цвета и находится справа посередине экрана
    Column(Modifier.fillMaxSize(), Arrangement.Center, Alignment.End) {
        Column(
            Modifier
                .size(80.dp)
                .background(Color.Red),
        )
        {

        }
    }
}

@Composable
fun Task4() {
    // ✅ Сделай экран в котором 3 колумна сверху вниз. все они занимают всю ширину. Первый по высоте 50дп. второй 100дп. а третий всё остальное пространство. пусть они будут 3х цветов как пельмени которые мы лепили))
    Column {
    Column(
        Modifier
            .fillMaxWidth()
            .height(50.dp)
            .background(Color.Cyan)
    ) { }
    Column(
        Modifier
            .fillMaxWidth()
            .height(100.dp)
            .background(Color.Magenta)
    ) { }
    Column(
        Modifier
            .fillMaxSize()
            .background(Color.Yellow) //TODO оранжевый есть в Task6
    ) { }
    }
}

@Composable
fun Task5() {
    // ✅ Выровняй 2 кнопки внутри Column по центру экрана.
    Column(
        Modifier
            .fillMaxSize(), Arrangement.Center, Alignment.CenterHorizontally
    ) {
        Button(
            onClick = {},
            modifier = Modifier
                .width(150.dp)
                .height(75.dp)
        ) {
            Text(text = "кчау")
        }
        Spacer(Modifier.size(16.dp)) //это для красоты, чтоб кнопки не были прилепленные друг ко другу)
        Button(
            onClick = {},
            modifier = Modifier
                .width(150.dp)
                .height(75.dp)
        ) {
            Text(text = "мяу")
        }
    }
}

@Composable
fun Task6() {
    // TODO: Сделай Колумн который занимает весь экран, у него отступы со всех сторон 16.дп и он оранжевый
    // TODO: а внутри него 3 колумна белых, занимающих всё доступное пространство одинаковые по размеру и у них тоже пэддинг 16.дп

    // TODO: вот тебе оранжевый - Color(0xFFFF8000)
    // TODO: тут не так, им не надо задавать size, им всем надо сделать одинаковый weight и fillMaxWidth

    Column(
        Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(Color.Yellow)
    ) {
        Column(
            Modifier
                .size(200.dp)
                .padding(16.dp)
                .background(Color.White)
        ) { }
        Column(
            Modifier
                .size(200.dp)
                .padding(16.dp)
                .background(Color.White)
        ) { }
        Column(
            Modifier
                .size(200.dp)
                .padding(16.dp)
                .background(Color.White)
        ) { }
        //сомниваюсь в правильности
    }
}

@Composable
fun Task7() {
    // ✅ Сделай родительский Колумн на весь экран. а в нем колумн 50х50 дп. Добавь дочернему Column рамку толщиной 2dp черного цвета.
    Column(
        Modifier
            .fillMaxSize()
            .background(Color.Cyan)
            .padding(16.dp)
    ) {
        Column(
            Modifier
                .size(50.dp)
                .background(Color.White)
                .border(2.dp, Color.Black)
        ) { }
    }
}

@Composable
fun Task8() {
    // ✅ Сделай родительский Column. В нем 3 Column, занимающие одинаковое пространство, с отступами 16.dp и разными цветами фона.
    // ✅ У каждого Column должно быть скругление углов. Внутри каждого Column размести 3 текста, что нибудь про любимую еду.
    // ✅ В первом Column используй Arrangement.Top, во втором - Arrangement.Center, в третьем - Arrangement.SpaceBetween.
    Column {
        Column(
            Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(Color.Green)
                .weight(1f)
                .padding(16.dp),
            Arrangement.Top
        ) {
            Text("бургер")
            Text("имба")
            Text("очень вкусный, сочненький, с курочкой")
        }
        Column(
            Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(Color.Yellow)
                .weight(1f)
                .padding(16.dp),
            Arrangement.Center
        ) {
            Text("курочка")
            Text("с корочкой")
            Text("cупер вкусная, сочная, мощная")
        }
        Column(
            Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(Color.Cyan)
                .weight(1f)
                .padding(16.dp),
            Arrangement.SpaceBetween
        ) {
            Text("суши")
            Text("филадельфия")
            Text("с соевым соусом, с васаби, супер вкусные")
        }
    }
}

@Composable
fun Task9() {
    // ✅ Сделай родительский Column. В нем 3 Column, занимающие одинаковое пространство, с отступами 16.dp и разными цветами фона.
    // ✅ У каждого Column должно быть скругление углов. Внутри каждого Column размести 3 текста, что нибудь про музыку.
    // ✅ В первом Column используй Alignment.Start, во втором - Alignment.CenterHorizontally, в третьем - Alignment.End.
    Column {
        Column(
            Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(Color.Yellow)
                .weight(1f)
                .padding(16.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text("Мой искупитель мой друг небесный")
            Text("меня на небо он посадил")
            Text("тутутутитутиту")
        }
        Column(
            Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(Color.LightGray)
                .weight(1f)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Земля пройдет и все дела")
            Text("сгорят")
            Text("тутитутитути")
        }
        Column(
            Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(Color.Magenta)
                .weight(1f)
                .padding(16.dp),
            horizontalAlignment = Alignment.End
        ) {
            Text("Бог прежде мира нас узнал")
            Text("нам оправданье даром дал")
            Text("туцитацитуцтуцтуц")
        }
    }
}

@Composable
fun Task10() {
    // ✅ Сделай родительский Column. В нем 3 Column, занимающие одинаковое пространство, с отступами 16.dp и разными цветами фона.
    // ✅ У каждого Column должно быть скругление углов. Внутри каждого Column размести 3 текста, что нибудь про науки)).
    // ✅ В первом Column используй Arrangement.Top и Alignment.Start, во втором - Arrangement.Center и Alignment.CenterHorizontally, в третьем - Arrangement.SpaceBetween и Alignment.End.
    Column {
        Column(
            Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(Color.Green)
                .weight(1f)
                .padding(16.dp),
            Arrangement.Top,
            horizontalAlignment = Alignment.Start
        ) {
            Text("математика")
            Text("капец")
            Text("теорема виета, дроби и т.д.")
        }
        Column(
            Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(Color.Yellow)
                .weight(1f)
                .padding(16.dp),
            Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("химия")
            Text("ужас")
            Text("H₂O - Вода")
        }
        Column(
            Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(Color.Cyan)
                .weight(1f)
                .padding(16.dp),
            Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.End
        ) {
            Text("физика")
            Text("емае")
            Text("E = mc²")
        }
    }
}

@Composable
fun Task11() {
    // ✅ Создай Column, в котором будет много элементов, чтобы была вертикальная прокрутка.
    // ✅ Используй Modifier.verticalScroll() для прокрутки.
    Column(
        Modifier
            .width(400.dp)
            .fillMaxHeight()
            .background(Color.Magenta)
            .padding(20.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Column(
            Modifier
                .size(60.dp)
                .background(Color.Blue)
        ) { }
        Spacer(Modifier.height(20.dp))
        Column(
            Modifier
                .size(60.dp)
                .background(Color.Blue)
        ) { }
        Spacer(Modifier.height(20.dp))
        Column(
            Modifier
                .size(60.dp)
                .background(Color.Blue)
        ) { }
        Spacer(Modifier.height(20.dp))
        Column(
            Modifier
                .size(60.dp)
                .background(Color.Blue)
        ) { }
        Spacer(Modifier.height(20.dp))
        Column(
            Modifier
                .size(60.dp)
                .background(Color.Blue)
        ) { }
        Spacer(Modifier.height(20.dp))
        Column(
            Modifier
                .size(60.dp)
                .background(Color.Blue)
        ) { }
        Spacer(Modifier.height(20.dp))
        Column(
            Modifier
                .size(60.dp)
                .background(Color.Blue)
        ) { }
        Spacer(Modifier.height(20.dp))
        Column(
            Modifier
                .size(60.dp)
                .background(Color.Blue)
        ) { }
        Spacer(Modifier.height(20.dp))
        Column(
            Modifier
                .size(60.dp)
                .background(Color.Blue)
        ) { }
        Spacer(Modifier.height(20.dp))
        Column(
            Modifier
                .size(60.dp)
                .background(Color.Blue)
        ) { }
        Spacer(Modifier.height(20.dp))
        Column(
            Modifier
                .size(60.dp)
                .background(Color.Blue)
        ) { }
        Spacer(Modifier.height(20.dp))
        Column(
            Modifier
                .size(60.dp)
                .background(Color.Blue)
        ) { }
        Spacer(Modifier.height(20.dp))
        Column(
            Modifier
                .size(60.dp)
                .background(Color.Blue)
        ) { }
        Spacer(Modifier.height(20.dp))
        Column(
            Modifier
                .size(60.dp)
                .background(Color.Blue)
        ) { }
        Spacer(Modifier.height(20.dp))
        Column(
            Modifier
                .size(60.dp)
                .background(Color.Blue)
        ) { }
        Spacer(Modifier.height(20.dp))
        Column(
            Modifier
                .size(60.dp)
                .background(Color.Blue)
        ) { }
        Spacer(Modifier.height(20.dp))
    }
}

@Composable
fun Task12() {
    // ✅ Создай LazyColumn.
    // ✅ В начале списка добавь item { Text("Начало") }.
    // ✅ Затем добавь список строк через items().
    // ✅ В конце списка добавь item { Text("Конец") }.
    LazyColumn(Modifier.fillMaxSize()) {
        item { Text("Начало") }
        items(7) {
            Spacer(Modifier.height(20.dp))
            Column(
                Modifier
                    .size(60.dp)
                    .background(Color.Blue)
            ) { }
            Spacer(Modifier.height(20.dp))
        }
        item { Text("Конец") }
    }
}

@Composable
fun Task13() {
    // ✅ Создай Column, в котором будут 3 блока:
    // ✅ - Первый занимает 20% высоты.
    // ✅ - Второй занимает 30% высоты.
    // ✅ - Третий занимает оставшиеся 50%.
    // ✅ Используй weight() для распределения пространства.
    Column(Modifier.fillMaxSize()) {
        Column(
            Modifier
                .fillMaxWidth()
                .weight(2f)
                .background(Color.Blue)
        ) { }
        Column(
            Modifier
                .fillMaxWidth()
                .weight(3f)
                .background(Color.Green)
        ) { }
        Column(
            Modifier
                .fillMaxWidth()
                .weight(5f)
                .background(Color.Magenta)
        ) { }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewColumnTasks() {
    //сюда пишете задание которое сейчас делаете, чтоб смотреть что получилось
    Task13()
}

/**
 * Справка по Column и Modifier:
 * - Column располагает элементы внутри сверху вниз.
 *
 * - Arrangement управляет распределением элементов внутри Column:
 *   - Arrangement.Top — элементы сжаты к верху.
 *   - Arrangement.Center — элементы расположены по центру.
 *   - Arrangement.End — элементы сжаты к концу.
 *   - Arrangement.SpaceBetween — элементы распределены равномерно.
 *   - Arrangement.SpaceAround — свободное пространство вокруг элементов.
 *   - Arrangement.SpaceEvenly — равномерное распределение свободного пространства.
 *
 *   у Колумна есть только verticalArrangement - распределение по вертикали
 *
 * - Alignment управляет выравниванием элементов внутри Column по горизонтали:
 *   - Alignment.Start — элементы выровнены влево.
 *   - Alignment.CenterHorizontally — элементы выровнены по центру.
 *   - Alignment.End — элементы выровнены вправо.
 *
 *   у Колумна только horizontalAlignment - выравнивание по горизонтали
 *
 * - Можно вкладывать один Column в другой и использовать Modifier.weight() для размеров по пропорции.
 *
 * - Modifier.padding() позволяет добавлять отступы. одно число - отступы с 4х сторон. 2 значения = первое по горизонтали, второе по вертикали, 4 значения - все 4 стороны
 * - Modifier.background() добавляет фон для Column.
 * - Modifier.border() можно использовать для создания границы вокруг Column.
 * - Modifier.height() задаёт фиксированную высоту Column.
 * - Modifier.width() задаёт фиксированную ширину Column.
 * - Modifier.size() позволяет задать одновременно ширину и высоту Column. одно значение - ширина и высота одинаковые - квадратный. если два значения то ширина и высота разные.
 * - Modifier.fillMaxHeight() - заполняет всю возможную высоту родительского компонента.
 * - Modifier.fillMaxWidth() - заполняет доступную ширину родительского компонента.
 * - Modifier.fillMaxSize() - заполняет всю доступную ширину и высоту родительского компонента.
 * - Modifier.clip() - обрезает содержимое по заданной форме, например Modifier.clip(RoundedCornerShape(12.dp))
 */