# [Bronze III] Префиксы-суффиксы - 28932 

[문제 링크](https://www.acmicpc.net/problem/28932) 

### 성능 요약

메모리: 4528 KB, 시간: 0 ms

### 분류

애드 혹

### 문제 설명

<p>Гиджет считает, что Максу нравятся только умные собаки, поэтому она решила почитать умных книжек. В одной из них она узнала понятия префикс и суффикс.</p>

<p>Префикс --- это подстрока, начало которой совпадает с началом строки, а суффикс --- это подстрока, конец которой совпадает с концом строки. Так, например, <<ab>> --- один из префиксов строки <<abacaba>>, а <<25>> --- суффикс строки <<ab125>>.</p>

<p>Гиджет заметила у хозяев в блокноте некоторую последовательность чисел, и ей стало интересно, существует ли хотя бы два, необязательно различных, числа таких, что один из префиксов первого равен одному из суффиксов второго.</p>

<p>К сожалению, эта задача оказалась для Гиджет слишком сложной. Помогите Гиджет в ее решении!</p>

### 입력 

 <p>В первой строке входного файла дано одно число $n$ --- количество чисел в блокноте. ($1 \le n \le 1000$)</p>

<p>Во второй строке записано $n$ чисел $a_i$ --- числа из блокнота. ($1 \le a_i \le 10^9$)</p>

### 출력 

 <p>В выходной файл выведите два числа $x$ и $y$ такие, что один из префиксов $x$-го числа в блокноте равен одному из суффиксов числа под номером $y$. Если таких двух чисел не существует, нужно вывести <code>-1</code>.</p>

