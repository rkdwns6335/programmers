# [level 0] 접미사 배열 - 181909 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181909) 

### 성능 요약

메모리: 77.3 MB, 시간: 1.14 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2025년 02월 20일 18:03:04

### 문제 설명

<p style="user-select: auto !important;">어떤 문자열에 대해서 접미사는 특정 인덱스부터 시작하는 문자열을 의미합니다. 예를 들어, "banana"의 모든 접미사는 "banana", "anana", "nana", "ana", "na", "a"입니다.<br style="user-select: auto !important;">
문자열 <code style="user-select: auto !important;">my_string</code>이 매개변수로 주어질 때, <code style="user-select: auto !important;">my_string</code>의 모든 접미사를 사전순으로 정렬한 문자열 배열을 return 하는 solution 함수를 작성해 주세요.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;"><code style="user-select: auto !important;">my_string</code>은 알파벳 소문자로만 이루어져 있습니다.</li>
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">my_string</code>의 길이 ≤ 100</li>
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
<td style="user-select: auto !important;">"banana"</td>
<td style="user-select: auto !important;">["a", "ana", "anana", "banana", "na", "nana"]</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"programmers"</td>
<td style="user-select: auto !important;">["ammers", "ers", "grammers", "mers", "mmers", "ogrammers", "programmers", "rammers", "rogrammers", "rs", "s"]</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;">입출력 예 #1</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">예제 1번의 <code style="user-select: auto !important;">my_string</code>는 "banana"로 모든 접미사는 문제의 설명과 같습니다. 이를 사전순으로 정렬하면 "a", "ana", "anana", "banana", "na", "nana"이므로 ["a", "ana", "anana", "banana", "na", "nana"]를 return 합니다.</li>
</ul>

<p style="user-select: auto !important;">입출력 예 #2</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">예제 2번의 <code style="user-select: auto !important;">my_string</code>는 "programmers"이고 모든 접미사는 "programmers", "rogrammers", "ogrammers", "grammers", "rammers", "ammers", "mmers", "mers", "ers", "rs", "s"입니다. 이를 사전순으로 정렬한 문자열 배열 ["ammers", "ers", "grammers", "mers", "mmers", "ogrammers", "programmers", "rammers", "rogrammers", "rs", "s"]를 return 합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges