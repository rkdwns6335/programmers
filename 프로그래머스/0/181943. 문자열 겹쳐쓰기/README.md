# [level 0] 문자열 겹쳐쓰기 - 181943 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181943) 

### 성능 요약

메모리: 81.5 MB, 시간: 1.87 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2025년 01월 18일 18:25:26

### 문제 설명

<p style="user-select: auto !important;">문자열 <code style="user-select: auto !important;">my_string</code>, <code style="user-select: auto !important;">overwrite_string</code>과 정수 <code style="user-select: auto !important;">s</code>가 주어집니다. 문자열 <code style="user-select: auto !important;">my_string</code>의 인덱스 <code style="user-select: auto !important;">s</code>부터 <code style="user-select: auto !important;">overwrite_string</code>의 길이만큼을 문자열 <code style="user-select: auto !important;">overwrite_string</code>으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;"><code style="user-select: auto !important;">my_string</code>와 <code style="user-select: auto !important;">overwrite_string</code>은 숫자와 알파벳으로 이루어져 있습니다.</li>
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">overwrite_string</code>의 길이 ≤ <code style="user-select: auto !important;">my_string</code>의 길이 ≤ 1,000</li>
<li style="user-select: auto !important;">0 ≤ <code style="user-select: auto !important;">s</code> ≤ <code style="user-select: auto !important;">my_string</code>의 길이 - <code style="user-select: auto !important;">overwrite_string</code>의 길이</li>
</ul>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">my_string</th>
<th style="user-select: auto !important;">overwrite_string</th>
<th style="user-select: auto !important;">s</th>
<th style="user-select: auto !important;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"He11oWor1d"</td>
<td style="user-select: auto !important;">"lloWorl"</td>
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">"HelloWorld"</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"Program29b8UYP"</td>
<td style="user-select: auto !important;">"merS123"</td>
<td style="user-select: auto !important;">7</td>
<td style="user-select: auto !important;">"ProgrammerS123"</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;">입출력 예 #1</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">예제 1번의 <code style="user-select: auto !important;">my_string</code>에서 인덱스 2부터 <code style="user-select: auto !important;">overwrite_string</code>의 길이만큼에 해당하는 부분은 "11oWor1"이고 이를 "lloWorl"로 바꾼 "HelloWorld"를 return 합니다.</li>
</ul>

<p style="user-select: auto !important;">입출력 예 #2</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">예제 2번의 <code style="user-select: auto !important;">my_string</code>에서 인덱스 7부터 <code style="user-select: auto !important;">overwrite_string</code>의 길이만큼에 해당하는 부분은 "29b8UYP"이고 이를 "merS123"로 바꾼 "ProgrammerS123"를 return 합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges