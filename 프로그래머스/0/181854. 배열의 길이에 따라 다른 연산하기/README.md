# [level 0] 배열의 길이에 따라 다른 연산하기 - 181854 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181854) 

### 성능 요약

메모리: 75.8 MB, 시간: 0.09 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2025년 01월 22일 16:44:23

### 문제 설명

<p style="user-select: auto !important;">정수 배열 <code style="user-select: auto !important;">arr</code>과 정수 <code style="user-select: auto !important;">n</code>이 매개변수로 주어집니다. <code style="user-select: auto !important;">arr</code>의 길이가 홀수라면 <code style="user-select: auto !important;">arr</code>의 모든 짝수 인덱스 위치에 <code style="user-select: auto !important;">n</code>을 더한 배열을, <code style="user-select: auto !important;">arr</code>의 길이가 짝수라면 <code style="user-select: auto !important;">arr</code>의 모든 홀수 인덱스 위치에 <code style="user-select: auto !important;">n</code>을 더한 배열을 return 하는 solution 함수를 작성해 주세요.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">arr</code>의 길이 ≤ 1,000</li>
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">arr</code>의 원소 ≤ 1,000</li>
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">n</code> ≤ 1,000</li>
</ul>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">arr</th>
<th style="user-select: auto !important;">n</th>
<th style="user-select: auto !important;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[49, 12, 100, 276, 33]</td>
<td style="user-select: auto !important;">27</td>
<td style="user-select: auto !important;">[76, 12, 127, 276, 60]</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[444, 555, 666, 777]</td>
<td style="user-select: auto !important;">100</td>
<td style="user-select: auto !important;">[444, 655, 666, 877]</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;">입출력 예 #1</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">예제 1번의 <code style="user-select: auto !important;">arr</code>의 길이는 5로 홀수입니다. 따라서 <code style="user-select: auto !important;">arr</code>의 짝수 인덱스 0, 2, 4에 주어진 <code style="user-select: auto !important;">n</code> 값인 27을 더하면 [76, 12, 127, 276, 60]이 됩니다. 따라서 [76, 12, 127, 276, 60]를 return 합니다.</li>
</ul>

<p style="user-select: auto !important;">입출력 예 #1</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">예제 2번의 <code style="user-select: auto !important;">arr</code>의 길이는 4로 짝수입니다. 따라서 <code style="user-select: auto !important;">arr</code>의 홀수 인덱스 1, 3에 주어진 <code style="user-select: auto !important;">n</code> 값인 100을 더하면 [444, 655, 666, 877]이 됩니다. 따라서 [444, 655, 666, 877]를 return 합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges