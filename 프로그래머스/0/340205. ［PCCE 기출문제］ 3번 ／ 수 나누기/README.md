# [level 0] [PCCE 기출문제] 3번 / 수 나누기 - 340205 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/340205) 

### 성능 요약

메모리: 69.9 MB, 시간: 331.34 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2025년 03월 19일 15:43:59

### 문제 설명

<p style="user-select: auto !important;">2자리 이상의 정수 <code style="user-select: auto !important;">number</code>가 주어집니다. 주어진 코드는 이 수를 2자리씩 자른 뒤, 자른 수를 모두 더해서 그 합을 출력하는 코드입니다. 코드가 올바르게 작동하도록 한 줄을 수정해 주세요.</p>

<hr style="user-select: auto !important;">

<h4 style="user-select: auto !important;">제한사항</h4>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">10 ≤ <code style="user-select: auto !important;">number</code> ≤ 2,000,000,000

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;"><code style="user-select: auto !important;">number</code>의 자릿수는 2의 배수입니다.</li>
</ul></li>
</ul>

<hr style="user-select: auto !important;">

<h4 style="user-select: auto !important;">입출력 예</h4>

<p style="user-select: auto !important;">입력 #1</p>
<div class="highlight" style="user-select: auto !important;"><pre class="codehilite" style="user-select: auto !important;"><code style="user-select: auto !important;">4859
</code></pre></div>
<p style="user-select: auto !important;">출력 #1</p>
<div class="highlight" style="user-select: auto !important;"><pre class="codehilite" style="user-select: auto !important;"><code style="user-select: auto !important;">107
</code></pre></div>
<p style="user-select: auto !important;">입력 #2</p>
<div class="highlight" style="user-select: auto !important;"><pre class="codehilite" style="user-select: auto !important;"><code style="user-select: auto !important;">29
</code></pre></div>
<p style="user-select: auto !important;">출력 #2</p>
<div class="highlight" style="user-select: auto !important;"><pre class="codehilite" style="user-select: auto !important;"><code style="user-select: auto !important;">29
</code></pre></div>
<hr style="user-select: auto !important;">

<h4 style="user-select: auto !important;">입출력 예 설명</h4>

<p style="user-select: auto !important;">입출력 예 #1</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">입력된 수를 2자리씩 나눠 합치면 다음과 같습니다.</li>
<li style="user-select: auto !important;">48 + 59 = 107</li>
</ul>

<p style="user-select: auto !important;">입출력 예 #2</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">입력된 수를 2자리씩 나눠 합치면 다음과 같습니다.</li>
<li style="user-select: auto !important;">29 &nbsp;= 29</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges