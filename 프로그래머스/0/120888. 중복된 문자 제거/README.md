# [level 0] 중복된 문자 제거 - 120888 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120888) 

### 성능 요약

메모리: 84.8 MB, 시간: 0.07 ms

### 구분

코딩테스트 연습 > 코딩테스트 입문

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2025년 02월 26일 16:58:18

### 문제 설명

<p style="user-select: auto !important;">문자열 <code style="user-select: auto !important;">my_string</code>이 매개변수로 주어집니다. <code style="user-select: auto !important;">my_string</code>에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을 return하도록 solution 함수를 완성해주세요.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">my_string</code> ≤ 110</li>
<li style="user-select: auto !important;"><code style="user-select: auto !important;">my_string</code>은 대문자, 소문자, 공백으로 구성되어 있습니다.</li>
<li style="user-select: auto !important;">대문자와 소문자를 구분합니다.</li>
<li style="user-select: auto !important;">공백(" ")도 하나의 문자로 구분합니다.</li>
<li style="user-select: auto !important;">중복된 문자 중 가장 앞에 있는 문자를 남깁니다.</li>
</ul>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">my_string</th>
<th style="user-select: auto !important;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"people"</td>
<td style="user-select: auto !important;">"peol"</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"We are the world"</td>
<td style="user-select: auto !important;">"We arthwold"</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;">입출력 예 #1</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">"people"에서 중복된 문자 "p"와 "e"을 제거한 "peol"을 return합니다.</li>
</ul>

<p style="user-select: auto !important;">입출력 예 #2</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">"We are the world"에서 중복된 문자 "e", " ", "r" 들을 제거한 "We arthwold"을 return합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges