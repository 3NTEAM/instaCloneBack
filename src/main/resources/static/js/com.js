document.addEventListener('DOMContentLoaded', function() {
    var searchInput = document.getElementById('hd_search');
    var deleteBtn = document.querySelector('.delete_btn');

    if (searchInput && deleteBtn) {
        // input 이벤트 리스너
        searchInput.addEventListener('input', function() {
            if (this.value.trim() !== '') {
                deleteBtn.style.display = 'block';
            } else {
                deleteBtn.style.display = 'none';
            }
        });

        // delete 버튼 클릭 시 입력 내용 지우기
        deleteBtn.addEventListener('click', function(e) {
            e.preventDefault(); // 기본 동작 방지 (필요 시)
            searchInput.value = ''; // 입력 내용 지우기
            deleteBtn.style.display = 'none'; // delete 버튼 숨기기
        });
    }
});
