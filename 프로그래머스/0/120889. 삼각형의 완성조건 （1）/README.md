# [level 0] 삼각형의 완성조건 (1) - 120889 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120889) 

### 성능 요약

메모리: 76.2 MB, 시간: 0.58 ms

### 구분

코딩테스트 연습 > 코딩테스트 입문

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2025년 02월 08일 17:55:24

### 문제 설명

<p style="user-select: auto !important;">선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.</li>
</ul>

<p style="user-select: auto !important;">삼각형의 세 변의 길이가 담긴 배열 <code style="user-select: auto !important;">sides</code>이 매개변수로 주어집니다. 세 변으로 삼각형을 만들 수 있다면 1, 만들 수 없다면 2를 return하도록 solution 함수를 완성해주세요.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;"><code style="user-select: auto !important;">sides</code>의 원소는 자연수입니다.</li>
<li style="user-select: auto !important;"><code style="user-select: auto !important;">sides</code>의 길이는 3입니다.</li>
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">sides</code>의 원소 ≤ 1,000</li>
</ul>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">sides</th>
<th style="user-select: auto !important;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[1, 2, 3]</td>
<td style="user-select: auto !important;">2</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[3, 6, 2]</td>
<td style="user-select: auto !important;">2</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[199, 72, 222]</td>
<td style="user-select: auto !important;">1</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;">입출력 예 #1</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">가장 큰 변인 3이 나머지 두 변의 합 3과 같으므로 삼각형을 완성할 수 없습니다. 따라서 2를 return합니다.</li>
</ul>

<p style="user-select: auto !important;">입출력 예 #2</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">가장 큰 변인 6이 나머지 두 변의 합 5보다 크므로 삼각형을 완성할 수 없습니다. 따라서 2를 return합니다.</li>
</ul>

<p style="user-select: auto !important;">입출력 예 #3</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">가장 큰 변인 222가 나머지 두 변의 합 271보다 작으므로 삼각형을 완성할 수 있습니다. 따라서 1을 return합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges